package com.app.inv.service.customer;

import com.app.inv.contracts.customer.AskResponse;
import com.app.inv.mappers.customer.CustomerMappers;
import com.app.inv.repository.customer.CustomerRepository;
import com.app.inv.service.context.customer.AskContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMappers customerMappers;
    private final CustomerRepository customerRepository;

    @Override
    public AskResponse ask(AskContext askContext) {
        //call repository layer to save device id in the db with the request
        var requestDTO = customerMappers.mapAskContextToRequestDTO(askContext);
        var savedRequestDTO = customerRepository.save(requestDTO);
        //send the request async
        return customerMappers.mapRequestDTOToAskResponse(savedRequestDTO);
    }
}
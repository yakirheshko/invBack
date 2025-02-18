package com.app.inv.service.customer;

import com.app.inv.contracts.business.FindRequestsResponse;
import com.app.inv.contracts.customer.AskResponse;
import com.app.inv.mappers.RequestsMappers;
import com.app.inv.repository.RequestsRepository;
import com.app.inv.service.context.customer.AskContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final RequestsMappers requestsMappers;
    private final RequestsRepository requestsRepository;

    @Override
    public AskResponse ask(AskContext askContext) {
        //call repository layer to save device id in the db with the request
        var requestDTO = requestsMappers.mapAskContextToRequestDTO(askContext);
        var savedRequestDTO = requestsRepository.save(requestDTO);
        //send the request async
        return requestsMappers.mapRequestDTOToAskResponse(savedRequestDTO);
    }

    @Override
    public FindRequestsResponse requests(String deviceId) {
        var requestDTOList = requestsRepository.findByDeviceIdAndActiveIsTrue(deviceId);
        return requestsMappers.maprequestDTOListToFindRequestsResponse(requestDTOList);
    }

    @Transactional
    @Override
    public void deactivateRequest(String id) {
        requestsRepository.deactivateRequestsById(id);
    }
}
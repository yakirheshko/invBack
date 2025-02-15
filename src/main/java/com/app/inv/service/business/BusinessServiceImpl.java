package com.app.inv.service.business;

import com.app.inv.contracts.business.CreateBusinessResponse;
import com.app.inv.mappers.business.BusinessMapper;
import com.app.inv.repository.business.BusinessRepository;
import com.app.inv.service.context.business.CreateBusinessContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BusinessServiceImpl implements BusinessService {

    private final BusinessMapper businessMapper;
    private final BusinessRepository businessRepository;

    @Override
    public CreateBusinessResponse create(CreateBusinessContext createBusinessContext) {
        var businessDTO = businessMapper.mapCreateBusinessContextToBusinessDTO(createBusinessContext);
       var savedBusinessDTO = businessRepository.save(businessDTO);

        return businessMapper.mapBusinessDTOToCreateBusinessResponse(savedBusinessDTO);
    }
}
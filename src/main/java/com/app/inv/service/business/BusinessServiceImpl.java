package com.app.inv.service.business;

import com.app.inv.contracts.business.CreateBusinessResponse;
import com.app.inv.contracts.business.FindRequestsResponse;
import com.app.inv.mappers.BusinessMapper;
import com.app.inv.mappers.RequestsMappers;
import com.app.inv.mappers.ResponsesMapper;
import com.app.inv.repository.BusinessRepository;
import com.app.inv.repository.RequestsRepository;
import com.app.inv.repository.ResponsesRepository;
import com.app.inv.service.context.business.CreateBusinessContext;
import com.app.inv.service.context.business.ResponseContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BusinessServiceImpl implements BusinessService {

    private final BusinessMapper businessMapper;
    private final RequestsMappers requestsMappers;
    private final ResponsesMapper responsesMapper;
    private final BusinessRepository businessRepository;
    private final RequestsRepository requestsRepository;
    private final ResponsesRepository responsesRepository;

    @Override
    public CreateBusinessResponse create(CreateBusinessContext createBusinessContext) {
        var businessDTO = businessMapper.mapCreateBusinessContextToBusinessDTO(createBusinessContext);
        var savedBusinessDTO = businessRepository.save(businessDTO);

        return businessMapper.mapBusinessDTOToCreateBusinessResponse(savedBusinessDTO);
    }

    @Override
    public CreateBusinessResponse get(String deviceId) {
        var savedBusinessDTO = businessRepository.getByDeviceId(deviceId);
        return businessMapper.mapBusinessDTOToCreateBusinessResponse(savedBusinessDTO);
    }

    @Override
    public FindRequestsResponse findRequests(String deviceId) {
        var business = businessRepository.getByDeviceId(deviceId);
        var requestDTOList = requestsRepository.findRequestsWithoutResponse(deviceId,business.getCategory());
        var x = requestsMappers.maprequestDTOListToFindRequestsResponse(requestDTOList);
        return x;
    }

    @Override
    public void response(ResponseContext responseContext) {
        //add to responses
        var responseDTO = responsesMapper.mapResponseContextToResponseDTO(responseContext);
        responsesRepository.save(responseDTO);
    }
}
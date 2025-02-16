package com.app.inv.mappers;

import com.app.inv.contracts.business.FindRequestsResponse;
import com.app.inv.contracts.business.Request;
import com.app.inv.contracts.customer.AskRequest;
import com.app.inv.contracts.customer.AskResponse;
import com.app.inv.repository.dto.RequestDTO;
import com.app.inv.service.context.customer.AskContext;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface RequestsMappers {

    @Mapping(target = "deviceId", source = "deviceId")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "area", source = "area")
    AskContext mapAskRequestToAskContext(AskRequest askRequest);

    @Mapping(target = "deviceId", source = "deviceId")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "area", source = "area")
    RequestDTO mapAskContextToRequestDTO(AskContext askContext);

    @Mapping(target = "deviceId", source = "deviceId")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "area", source = "area")
    AskResponse mapRequestDTOToAskResponse(RequestDTO requestDTO);

    @Mapping(target = "requestDeviceId", source = "deviceId")
    Request mapRequestDTOToRequest(RequestDTO requestDTO);

    List<Request> mapRequestDTOListToRequestList(List<RequestDTO> requestDTOList);

    @Mappings({@Mapping(source = "requestDTOList", target = "requests")})
    default FindRequestsResponse maprequestDTOListToFindRequestsResponse(List<RequestDTO> requestDTOList) {
        FindRequestsResponse response = new FindRequestsResponse();
        response.setRequests(mapRequestDTOListToRequestList(requestDTOList)); // Ensure this is mapped correctly
        return response;
    }

}
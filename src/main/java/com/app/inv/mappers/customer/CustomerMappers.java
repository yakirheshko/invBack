package com.app.inv.mappers.customer;

import com.app.inv.contracts.customer.AskRequest;
import com.app.inv.contracts.customer.AskResponse;
import com.app.inv.repository.customer.dto.RequestDTO;
import com.app.inv.service.context.customer.AskContext;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CustomerMappers {

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
    AskResponse mapRequestDTOToAskResponse(RequestDTO requestDTO);
}
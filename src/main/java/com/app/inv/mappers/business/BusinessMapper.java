package com.app.inv.mappers.business;

import com.app.inv.contracts.business.CreateBusinessRequest;
import com.app.inv.contracts.business.CreateBusinessResponse;
import com.app.inv.repository.business.dto.BusinessDTO;
import com.app.inv.service.context.business.CreateBusinessContext;
import org.mapstruct.*;

//remove unneeded mapping after fix lombok?
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BusinessMapper {

    @Mapping(target = "deviceId", source = "deviceId")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "location", source = "location")
    CreateBusinessContext mapCreateBusinessRequestToCreateBusinessContext(CreateBusinessRequest createBusinessRequest);

    @Mapping(target = "deviceId", source = "deviceId")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "location", source = "location")
    BusinessDTO mapCreateBusinessContextToBusinessDTO(CreateBusinessContext createBusinessContext);

    CreateBusinessResponse mapBusinessDTOToCreateBusinessResponse(BusinessDTO businessDTO);
}
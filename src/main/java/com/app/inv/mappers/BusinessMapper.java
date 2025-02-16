package com.app.inv.mappers;

import com.app.inv.contracts.business.*;
import com.app.inv.repository.dto.BusinessDTO;
import com.app.inv.repository.dto.RequestDTO;
import com.app.inv.service.context.business.CreateBusinessContext;
import com.app.inv.service.context.business.ResponseContext;
import org.mapstruct.*;

import java.util.List;

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
package com.app.inv.mappers;

import com.app.inv.contracts.business.*;
import com.app.inv.repository.dto.BusinessDTO;
import com.app.inv.repository.dto.RequestDTO;
import com.app.inv.repository.dto.ResponseDTO;
import com.app.inv.service.context.business.CreateBusinessContext;
import com.app.inv.service.context.business.ResponseContext;
import org.mapstruct.*;

import java.util.List;

//remove unneeded mapping after fix lombok?
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ResponsesMapper {
    ResponseContext mapResponseRequestToResponseContext(ResponseRequest responseRequest);
    ResponseDTO mapResponseContextToResponseDTO(ResponseContext responseContext);

}
package com.app.inv.controller;


import com.app.inv.contracts.business.CreateBusinessRequest;
import com.app.inv.contracts.business.CreateBusinessResponse;
import com.app.inv.mappers.business.BusinessMapper;
import com.app.inv.service.business.BusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
@RequiredArgsConstructor
public class BusinessController {

    private final BusinessMapper businessMapper;
    private final BusinessService businessService;

    @PostMapping("/create")
    public CreateBusinessResponse create(@RequestBody CreateBusinessRequest createBusinessRequest) {
        var createBusinessContext = businessMapper.mapCreateBusinessRequestToCreateBusinessContext(createBusinessRequest);
        return businessService.create(createBusinessContext);
    }
}
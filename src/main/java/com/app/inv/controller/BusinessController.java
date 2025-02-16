package com.app.inv.controller;

import com.app.inv.contracts.business.CreateBusinessRequest;
import com.app.inv.contracts.business.CreateBusinessResponse;
import com.app.inv.contracts.business.FindRequestsResponse;
import com.app.inv.contracts.business.ResponseRequest;
import com.app.inv.mappers.BusinessMapper;
import com.app.inv.mappers.ResponsesMapper;
import com.app.inv.service.business.BusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/business")
@RequiredArgsConstructor
public class BusinessController {

    private final BusinessMapper businessMapper;
    private final ResponsesMapper responsesMapper;
    private final BusinessService businessService;

    @PostMapping("/create")
    public CreateBusinessResponse create(@RequestBody CreateBusinessRequest createBusinessRequest) {
        var createBusinessContext = businessMapper.mapCreateBusinessRequestToCreateBusinessContext(createBusinessRequest);
        return businessService.create(createBusinessContext);
    }

    @GetMapping("/get")
    public CreateBusinessResponse get(@RequestParam String deviceId) {
        return businessService.get(deviceId);
    }

    @GetMapping("/requests")
    public FindRequestsResponse findRequests(@RequestParam String deviceId) {
        return businessService.findRequests(deviceId);
    }

    @PostMapping("/response")
    public void response(@RequestBody ResponseRequest responseRequest) {
        var responseContext = responsesMapper.mapResponseRequestToResponseContext(responseRequest);
        businessService.response(responseContext);
    }


}
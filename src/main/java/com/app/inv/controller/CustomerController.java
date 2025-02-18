package com.app.inv.controller;

import com.app.inv.contracts.business.FindRequestsResponse;
import com.app.inv.contracts.customer.AskRequest;
import com.app.inv.contracts.customer.AskResponse;
import com.app.inv.contracts.customer.CustomerDeactivateRequest;
import com.app.inv.mappers.RequestsMappers;
import com.app.inv.service.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final RequestsMappers requestsMappers;
    private final CustomerService customerService;

    @PostMapping("/ask")
    public AskResponse ask(@RequestBody AskRequest askRequest) {
        var askContext = requestsMappers.mapAskRequestToAskContext(askRequest);
        return customerService.ask(askContext);
    }

    @GetMapping("/requests")
    public FindRequestsResponse requests(@RequestParam String deviceId) {
        return customerService.requests(deviceId);
    }

    @PostMapping("/requests/deactivate")
    public void deactivateRequest(@RequestBody CustomerDeactivateRequest customerDeactivateRequest) {
        customerService.deactivateRequest(customerDeactivateRequest.getId());
    }
}
package com.app.inv.controller;

import com.app.inv.contracts.customer.AskRequest;
import com.app.inv.contracts.customer.AskResponse;
import com.app.inv.mappers.RequestsMappers;
import com.app.inv.service.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
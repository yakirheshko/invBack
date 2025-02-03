package com.app.inv.controller;

import com.app.inv.contracts.AskRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/ask")
    public Object ask(@RequestBody AskRequest askRequest) {
        return String.format("DeviceId: %s, Category: %s, Description: %s, Area: %s",
                askRequest.getDeviceId(), askRequest.getCategory(), askRequest.getDescription(), askRequest.getArea());
    }
}
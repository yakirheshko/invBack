package com.app.inv.contracts.business;

import lombok.Data;

@Data
//add request validations
public class ResponseRequest {
    private String requestId;
    private String deviceId;
    private String response;
}

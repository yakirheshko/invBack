package com.app.inv.contracts.business;

import lombok.Data;

@Data
//add request validations
public class CreateBusinessRequest {
    private String deviceId;
    private String category;
    private String location;
}

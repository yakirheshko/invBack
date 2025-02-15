package com.app.inv.contracts.customer;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
//add request validations
//fix lombok
public class AskRequest {
    private String deviceId;
    private String category;

    public String getDeviceId() {
        return deviceId;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getArea() {
        return area;
    }

    private String description;
    private String area;
}
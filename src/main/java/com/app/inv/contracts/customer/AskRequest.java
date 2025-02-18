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
    private String description;
    private String title;
    private String distance;

    public String getTitle() {
        return title;
    }

    public String getDistance() {
        return distance;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
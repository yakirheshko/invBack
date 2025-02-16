package com.app.inv.service.context.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CreateBusinessContext {
    private String deviceId;
    private String category;
    private String location;

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
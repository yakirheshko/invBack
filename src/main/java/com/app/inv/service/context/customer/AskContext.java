package com.app.inv.service.context.customer;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
//fix lombok
public class AskContext {
    private String deviceId;
    private String category;
    private String description;
    private String title;
    private String distance;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTitle() {
        return title;
    }

    public String getDistance() {
        return distance;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
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
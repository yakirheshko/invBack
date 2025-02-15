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
    private String area;

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setArea(String area) {
        this.area = area;
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

    public String getArea() {
        return area;
    }
}
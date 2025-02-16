package com.app.inv.contracts.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AskResponse {
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
}

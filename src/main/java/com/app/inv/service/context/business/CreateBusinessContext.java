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

    public String getDeviceId() {
        return deviceId;
    }
}
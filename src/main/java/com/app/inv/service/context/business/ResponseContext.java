package com.app.inv.service.context.business;

import lombok.Data;

@Data
public class ResponseContext {
    private String requestId;
    private String deviceId;
    private String response;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getResponse() {
        return response;
    }
}
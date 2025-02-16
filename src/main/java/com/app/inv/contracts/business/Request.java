package com.app.inv.contracts.business;

import lombok.Data;

@Data
public class Request {
    private String id;
    private String requestDeviceId;
    private String category;
    private String description;
    private String area;

    public void setId(String id) {
        this.id = id;
    }

    public void setRequestDeviceId(String requestDeviceId) {
        this.requestDeviceId = requestDeviceId;
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

    public String getId() {
        return id;
    }

    public String getRequestDeviceId() {
        return requestDeviceId;
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
package com.app.inv.contracts.business;

import lombok.Data;

@Data
public class Request {
    private String id;
    private String requestDeviceId;
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
}
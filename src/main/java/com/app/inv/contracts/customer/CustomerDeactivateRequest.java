package com.app.inv.contracts.customer;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
//add request validations
//fix lombok
public class CustomerDeactivateRequest {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
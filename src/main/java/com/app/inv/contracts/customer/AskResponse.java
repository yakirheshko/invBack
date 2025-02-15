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
}

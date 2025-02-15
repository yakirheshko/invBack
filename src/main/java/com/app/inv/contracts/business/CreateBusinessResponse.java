package com.app.inv.contracts.business;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateBusinessResponse {
    private String deviceId;
    private String category;
    private String location;
}

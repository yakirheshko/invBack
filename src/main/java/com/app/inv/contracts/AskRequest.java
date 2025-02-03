package com.app.inv.contracts;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AskRequest {
    @NotNull
    private String deviceId;
    @NotNull
    private String category;
    @NotNull
    private String description;
    @NotNull
    private String area;

}

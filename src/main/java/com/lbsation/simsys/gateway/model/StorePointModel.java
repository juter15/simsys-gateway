package com.lbsation.simsys.gateway.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StorePointModel {

    @JsonProperty("CHARGE")
    private Integer charge;
    @JsonProperty("SUBSCRIBE")
    private Integer subscribe;
    @JsonProperty("MANGE")
    private Integer mange;
}

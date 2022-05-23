package com.lbsation.simsys.gateway.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorePlaceModel {

    @JsonProperty("LATITUDE")
    private double latitude;
    @JsonProperty("LONGITUDE")
    private double longitude;
}

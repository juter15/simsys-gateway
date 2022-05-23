package com.lbsation.simsys.gateway.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class StoreModel {
    @JsonProperty("STORE_ID")
    private String storeId;
    @JsonProperty("STORE_NAME")
    private String storeName;

    @JsonProperty("POINT")
    private StorePointModel storePointModel;

    @JsonProperty("CAMPAIGN_PLACE")
    private StorePlaceModel storePlaceModel;


    @JsonProperty("CREATE_DATE")
    private String createDate;
    @JsonProperty("UPDATE_DATE")
    private String updateDate;
}

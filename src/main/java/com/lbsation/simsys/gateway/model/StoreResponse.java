package com.lbsation.simsys.gateway.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StoreResponse<T> {
    @JsonProperty("result")
    private ResultModel resultModel;

    @JsonProperty("data")
    private T storeData;


    public StoreResponse(ResultModel result){
        this.resultModel = result;
    }
}

package com.lbsation.simsys.gateway.proxy;

import com.lbsation.simsys.gateway.model.StoreRequest;
import com.lbsation.simsys.gateway.model.StoreResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "simsys-service", url = "${microservices.simsys-service}", fallbackFactory = SimsysServiceProxyFallbackFactory.class)
public interface SimsysServiceProxy {

    @PostMapping("/franchise/store/list")
    StoreResponse getStoreList(@RequestHeader(value = "FRANCHISE_ID") String franchiseSeq, @RequestBody StoreRequest storeRequest);

    @PostMapping("/franchise/store/user")
    StoreResponse getStoreUser(@RequestHeader(value = "Store_ID") String storeSeq);
}

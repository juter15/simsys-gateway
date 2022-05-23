package com.lbsation.simsys.gateway.proxy;

import com.lbsation.simsys.gateway.model.StoreRequest;
import com.lbsation.simsys.gateway.model.StoreResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimsysServiceProxyFallback implements SimsysServiceProxy{
    private final Throwable cause;

    SimsysServiceProxyFallback(Throwable cause) {
        this.cause = cause;
    }



    @Override
    public StoreResponse getStoreList(String franchiseSeq, StoreRequest storeRequest) {
        log.error(cause.getMessage());
        return null;
    }

    @Override
    public StoreResponse getStoreUser(String storeSeq) {
        log.error(cause.getMessage());
        return null;
    }
}

package com.lbsation.simsys.gateway.proxy;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class SimsysServiceProxyFallbackFactory implements FallbackFactory<SimsysServiceProxyFallback> {

    @Override
    public SimsysServiceProxyFallback create(Throwable cause) {
        return new SimsysServiceProxyFallback(cause);
    }
}

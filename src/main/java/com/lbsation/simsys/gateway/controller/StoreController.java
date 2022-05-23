package com.lbsation.simsys.gateway.controller;

import com.lbsation.simsys.gateway.model.StoreRequest;
import com.lbsation.simsys.gateway.proxy.SimsysServiceProxy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController("/franchise/store")
@Slf4j
@RequiredArgsConstructor
public class StoreController {
    private final SimsysServiceProxy simsysServiceProxy;
    @PostMapping("/list")
    public ResponseEntity getStoreList(
            @RequestHeader("FRANCHISE_ID") String franchiseSeq,
            @RequestBody StoreRequest storeRequest)
    {
        log.info("###Simsys Gateway LIST- franchiseSeq: {}", franchiseSeq);
        return ResponseEntity.ok(simsysServiceProxy.getStoreList(franchiseSeq, storeRequest));
    }

    @PostMapping("/user")
    public ResponseEntity getStoreUser(@RequestHeader("STORE_ID") String storeSeq){

        log.info("###Simsys Gateway USER - storeSeq: {}", storeSeq);
        return ResponseEntity.ok(simsysServiceProxy.getStoreUser(storeSeq));
    }
}

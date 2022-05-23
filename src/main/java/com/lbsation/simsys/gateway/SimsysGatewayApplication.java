package com.lbsation.simsys.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SimsysGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimsysGatewayApplication.class, args);
    }

}

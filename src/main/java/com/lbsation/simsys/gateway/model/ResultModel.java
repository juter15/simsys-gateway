package com.lbsation.simsys.gateway.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class ResultModel {
    private Integer code = 200;
    private String message = "OK";
    private Date time = new Date();
}

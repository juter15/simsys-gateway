package com.lbsation.simsys.gateway.controller.adviser;

import com.lbsation.simsys.gateway.UnauthorizedException;
import com.lbsation.simsys.gateway.model.ResultModel;
import com.lbsation.simsys.gateway.model.StoreResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@ControllerAdvice
public class ErrorControllerAdviser {
    /**
     * 인증에 실패한 경우
     */
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity unauthorized(UnauthorizedException e) {
        ResultModel result = new ResultModel()
                .setCode(102)
                .setMessage(e.getMessage())
                .setTime(new Date());

        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(new StoreResponse(result));
    }
}

package com.lbsation.simsys.gateway.security;

import com.lbsation.simsys.gateway.UnauthorizedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Value("${simsys.token}")
    private String token;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String apiKey = request.getHeader("AUTHORIZATION");
        log.debug("### AUTHORIZATION: {}", apiKey);
        log.info("### AUTHORIZATION: {}", apiKey);

        if (token.equals(apiKey)) {
            return true;
        }

        throw new UnauthorizedException("UNAUTHORIZED");
    }
}

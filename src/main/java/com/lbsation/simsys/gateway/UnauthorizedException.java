package com.lbsation.simsys.gateway;

public class UnauthorizedException extends RuntimeException {
    private static final long serialVersionUID = -122509219022264336L;

    public UnauthorizedException(String message) {
        super(message);
    }
}

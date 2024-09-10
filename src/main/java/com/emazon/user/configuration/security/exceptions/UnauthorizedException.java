package com.emazon.user.configuration.security.exceptions;

import com.emazon.user.domain.utils.DomainConstants;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(){
        super(DomainConstants.INVALID_USER_OR_PASSWORD_MESSAGE);
    }
}

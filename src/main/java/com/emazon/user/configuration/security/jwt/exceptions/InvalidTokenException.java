package com.emazon.user.configuration.security.jwt.exceptions;

import com.emazon.user.domain.utils.DomainConstants;
import org.springframework.security.core.AuthenticationException;

public class InvalidTokenException extends AuthenticationException {
    public InvalidTokenException() {
        super(DomainConstants.INVALID_TOKEN_MESSAGE);
    }
}

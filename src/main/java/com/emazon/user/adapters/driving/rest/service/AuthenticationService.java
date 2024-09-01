package com.emazon.user.adapters.driving.rest.service;

import com.emazon.user.adapters.driving.rest.dto.request.AuthenticationRequest;
import com.emazon.user.adapters.driving.rest.dto.request.AuthorizationRequest;
import com.emazon.user.adapters.driving.rest.dto.request.UserRequest;
import com.emazon.user.adapters.driving.rest.dto.response.AuthenticationResponse;
import com.emazon.user.adapters.driving.rest.dto.response.AuthorizationResponse;
import com.emazon.user.adapters.driving.rest.dto.response.RegisterResponse;

public interface AuthenticationService {
    RegisterResponse createWarehouseAssistant(UserRequest userRequest);
    AuthenticationResponse login(AuthenticationRequest authenticationRequest);
    AuthorizationResponse authorize(AuthorizationRequest authorizationRequest);
}

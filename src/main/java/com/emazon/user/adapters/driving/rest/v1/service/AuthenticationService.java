package com.emazon.user.adapters.driving.rest.v1.service;

import com.emazon.user.adapters.driving.rest.v1.dto.request.AuthenticationRequest;
import com.emazon.user.adapters.driving.rest.v1.dto.request.AuthorizationRequest;
import com.emazon.user.adapters.driving.rest.v1.dto.request.UserRequest;
import com.emazon.user.adapters.driving.rest.v1.dto.response.AuthenticationResponse;
import com.emazon.user.adapters.driving.rest.v1.dto.response.AuthorizationResponse;
import com.emazon.user.adapters.driving.rest.v1.dto.response.RegisterResponse;

public interface AuthenticationService {
    RegisterResponse createWarehouseAssistant(UserRequest userRequest);
    RegisterResponse createCustomer(UserRequest userRequest);
    AuthenticationResponse login(AuthenticationRequest authenticationRequest);
    AuthorizationResponse authorize(AuthorizationRequest authorizationRequest);
}

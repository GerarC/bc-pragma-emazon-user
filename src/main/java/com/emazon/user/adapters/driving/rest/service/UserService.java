package com.emazon.user.adapters.driving.rest.service;

import com.emazon.user.adapters.driving.rest.dto.request.UserRequest;
import com.emazon.user.adapters.driving.rest.dto.response.RegisterResponse;

public interface UserService {
    RegisterResponse createWarehouseAssistant(UserRequest userRequest);
}

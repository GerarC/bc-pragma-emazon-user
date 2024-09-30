package com.emazon.user.adapters.driving.rest.v1.service;

import com.emazon.user.adapters.driving.rest.v1.dto.response.ExistsUserResponse;
import com.emazon.user.adapters.driving.rest.v1.dto.response.UserResponse;

public interface UserService {
    ExistsUserResponse existsUserById(String id);
    UserResponse getByToken(String token);
}

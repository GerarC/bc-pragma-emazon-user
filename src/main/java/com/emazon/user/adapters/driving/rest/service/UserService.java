package com.emazon.user.adapters.driving.rest.service;

import com.emazon.user.adapters.driving.rest.dto.response.ExistsUserResponse;
import com.emazon.user.adapters.driving.rest.dto.response.UserResponse;

public interface UserService {
    ExistsUserResponse existsUserById(String id);
    UserResponse getByToken(String token);
}

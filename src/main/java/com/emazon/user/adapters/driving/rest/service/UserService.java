package com.emazon.user.adapters.driving.rest.service;

import com.emazon.user.adapters.driving.rest.dto.response.ExistsUserResponse;

public interface UserService {
    ExistsUserResponse existsUserById(String id);
}

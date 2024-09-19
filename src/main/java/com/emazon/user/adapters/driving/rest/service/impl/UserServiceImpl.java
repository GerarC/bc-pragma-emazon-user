package com.emazon.user.adapters.driving.rest.service.impl;

import com.emazon.user.adapters.driving.rest.dto.response.ExistsUserResponse;
import com.emazon.user.adapters.driving.rest.service.UserService;
import com.emazon.user.domain.api.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserServicePort userServicePort;

    @Override
    public ExistsUserResponse existsUserById(String id) {
        return ExistsUserResponse.builder()
                .exists(userServicePort.userExistsById(id))
                .build();
    }
}

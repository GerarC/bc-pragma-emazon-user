package com.emazon.user.adapters.driving.rest.service.impl;

import com.emazon.user.adapters.driving.rest.dto.response.ExistsUserResponse;
import com.emazon.user.adapters.driving.rest.dto.response.UserResponse;
import com.emazon.user.adapters.driving.rest.mapper.response.UserResponseMapper;
import com.emazon.user.adapters.driving.rest.service.UserService;
import com.emazon.user.configuration.security.jwt.JwtService;
import com.emazon.user.domain.api.UserServicePort;
import com.emazon.user.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserServicePort userServicePort;
    private final UserResponseMapper userResponseMapper;
    private final JwtService jwtService;

    @Override
    public ExistsUserResponse existsUserById(String id) {
        return ExistsUserResponse.builder()
                .exists(userServicePort.userExistsById(id))
                .build();
    }

    @Override
    public UserResponse getByToken(String token) {
        String email = jwtService.extractUsername(token);
        User user = userServicePort.getUserByEmail(email);
        return userResponseMapper.toResponse(user);
    }
}

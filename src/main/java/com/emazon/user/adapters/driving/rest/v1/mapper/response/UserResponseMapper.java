package com.emazon.user.adapters.driving.rest.v1.mapper.response;

import com.emazon.user.adapters.driving.rest.v1.dto.response.UserResponse;
import com.emazon.user.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserResponseMapper {
    UserResponse toResponse(User user);
    List<UserResponse> toResponses(List<User> users);
}

package com.emazon.user.adapters.driven.jpa.mapper;

import com.emazon.user.adapters.driven.jpa.entity.RoleEntity;
import com.emazon.user.domain.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleEntityMapper {
    RoleEntity toEntity(Role role);
    Role toUser(RoleEntity roleEntity);
    List<Role> toRoles(List<RoleEntity> roleEntities);
}

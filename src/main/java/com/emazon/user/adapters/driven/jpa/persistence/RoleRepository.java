package com.emazon.user.adapters.driven.jpa.persistence;

import com.emazon.user.adapters.driven.jpa.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}

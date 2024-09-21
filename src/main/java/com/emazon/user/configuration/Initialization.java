package com.emazon.user.configuration;

import com.emazon.user.adapters.driven.jpa.entity.RoleEntity;
import com.emazon.user.adapters.driven.jpa.entity.UserEntity;
import com.emazon.user.adapters.driven.jpa.persistence.RoleRepository;
import com.emazon.user.adapters.driven.jpa.persistence.UserRepository;
import com.emazon.user.domain.utils.RoleName;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class Initialization {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Bean
    CommandLineRunner init(){
        return args -> {
            if(!roleRepository.findAll().isEmpty()) return;

            List<RoleEntity> roles = List.of(
                    RoleEntity.builder().roleName(RoleName.ADMIN).build(),
                    RoleEntity.builder().roleName(RoleName.WAREHOUSE_ASSISTANT).build(),
                    RoleEntity.builder().roleName(RoleName.CUSTOMER).build()
            );
            roleRepository.saveAll(roles);
            roles = roleRepository.findAll();

            UserEntity userEntity = UserEntity.builder()
                    .name("Admin")
                    .lastname("Admin")
                    .identityDocument("0000000001")
                    .email("admin@email.com")
                    .phone("3002341223")
                    .birthdate(LocalDateTime.of(2000, 1,1,1,1))
                    .password(passwordEncoder.encode("password"))
                    .role(roles.get(0))
                    .build();
            userRepository.save(userEntity);
        };
    }
}

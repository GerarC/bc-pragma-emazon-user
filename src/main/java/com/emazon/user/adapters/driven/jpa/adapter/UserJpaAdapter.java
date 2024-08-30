package com.emazon.user.adapters.driven.jpa.adapter;

import com.emazon.user.adapters.driven.jpa.entity.UserEntity;
import com.emazon.user.adapters.driven.jpa.mapper.UserEntityMapper;
import com.emazon.user.adapters.driven.jpa.persistence.RoleRepository;
import com.emazon.user.adapters.driven.jpa.persistence.UserRepository;
import com.emazon.user.domain.model.User;
import com.emazon.user.domain.spi.UserPersistencePort;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class UserJpaAdapter implements UserPersistencePort {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    private  final RoleRepository roleRepository;

    @Override
    public void createUser(User user) {
        UserEntity userEntity = userEntityMapper.toEntity(user);
        userEntity.setRole(
                roleRepository.findByRoleName(userEntity.getRole().getRoleName()).orElse(null)
        );
        userRepository.save(userEntity);

    }

    @Override
    public boolean userExistsByIdentityDocument(String identityDocument) {
        return userRepository.existsByIdentityDocument(identityDocument);
    }

    @Override
    public boolean userExistsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

}

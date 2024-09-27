package com.emazon.user.domain.api;

import com.emazon.user.domain.model.User;


public interface UserServicePort {
    void createWarehouseAssistant(User user);
    void createCustomer(User user);
    User getUserByEmail(String email);
    boolean userExistsById(String id);
}

package com.emazon.user.domain.model;

import java.time.LocalDateTime;

public class User {
    private String id;
    private String name;
    private String lastname;
    private String identityDocument;
    private LocalDateTime birthday;
    private String phone;
    private String email;
    private String password;
    private Role role;

    public User(String id, String name, String lastname, String identityDocument, LocalDateTime birthday, String phone, String email, String password, Role role) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.identityDocument = identityDocument;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
        this.identityDocument = identityDocument;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

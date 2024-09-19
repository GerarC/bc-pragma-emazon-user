package com.emazon.user.adapters.driving.rest.utils;

public class RestConstants {
    private RestConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String CODE_OK = "200";
    public static final String CODE_CREATED = "201";
    public static final String CODE_ACCEPTED = "202";
    public static final String CODE_CONFLICT = "409";
    public static final String CODE_BAD_REQUEST = "400";
    public static final String CODE_NOT_FOUND = "404";


    public static final String SWAGGER_REGISTER_WAREHOUSE_ASSISTANT_SUMMARY = "Register a new warehouse assistant";
    public static final String SWAGGER_REGISTER_WAREHOUSE_ASSISTANT_RESPONSE = "Warehouse assistant has been registered";
    public static final String SWAGGER_REGISTER_CUSTOMER_SUMMARY = "Register a new customer";
    public static final String SWAGGER_REGISTER_CUSTOMER_RESPONSE = "Customer has been registered";
    public static final String SWAGGER_REGISTER_USER_EMAIL_EXISTS = "User with that email already exists";
    public static final String SWAGGER_REGISTER_USER_IDENTITY_DOCUMENT_EXISTS = "User that identity document already exists";
    public static final String SWAGGER_REGISTER_USER_UNDERAGE = "User is under aged";
    public static final String SWAGGER_VALIDATIONS_DONT_PASS = "Some of the field doesn't pass validations";

    public static final String SWAGGER_LOGIN_SUMMARY = "Search if the user Exists in database and give him a token";
    public static final String SWAGGER_LOGIN_RESPONSE = "A token created with user information";
    public static final String SWAGGER_LOGIN_ERROR = "User email or password is incorrect";
    public static final String SWAGGER_AUTHORIZATION_SUMMARY = "Receives a token, validates it and returns email and rol";
    public static final String SWAGGER_AUTHORIZATION_RESPONSE = "An object with the email, rol and a boolean if it's validated";


    public static final String SWAGGER_USER_EXISTS_SUMMARY = "Return if a user with that id exists";
    public static final String SWAGGER_USER_EXISTS_RESPONSE = "The response can be false or true";

}

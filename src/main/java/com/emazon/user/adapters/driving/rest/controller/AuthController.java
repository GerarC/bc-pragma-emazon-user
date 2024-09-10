package com.emazon.user.adapters.driving.rest.controller;

import com.emazon.user.adapters.driving.rest.dto.request.AuthenticationRequest;
import com.emazon.user.adapters.driving.rest.dto.request.AuthorizationRequest;
import com.emazon.user.adapters.driving.rest.dto.request.UserRequest;
import com.emazon.user.adapters.driving.rest.dto.response.AuthenticationResponse;
import com.emazon.user.adapters.driving.rest.dto.response.AuthorizationResponse;
import com.emazon.user.adapters.driving.rest.dto.response.RegisterResponse;
import com.emazon.user.adapters.driving.rest.service.AuthenticationService;
import com.emazon.user.adapters.driving.rest.utils.RestConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService authenticationService;

    @Operation(summary = RestConstants.SWAGGER_REGISTER_WAREHOUSE_ASSISTANT_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = RestConstants.CODE_CREATED, description = RestConstants.SWAGGER_REGISTER_WAREHOUSE_ASSISTANT_RESPONSE),
            @ApiResponse(responseCode = RestConstants.CODE_CONFLICT, description = RestConstants.SWAGGER_REGISTER_USER_EMAIL_EXISTS),
            @ApiResponse(responseCode = RestConstants.CODE_CONFLICT, description = RestConstants.SWAGGER_REGISTER_USER_IDENTITY_DOCUMENT_EXISTS),
            @ApiResponse(responseCode = RestConstants.CODE_CONFLICT, description = RestConstants.SWAGGER_REGISTER_USER_UNDERAGE),
            @ApiResponse(responseCode = RestConstants.CODE_BAD_REQUEST, description = RestConstants.SWAGGER_VALIDATIONS_DONT_PASS),
    })
    @PostMapping("/register/warehouse-assistant")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<RegisterResponse> registerWarehouseAssistant(@RequestBody @Valid UserRequest userRequest){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(authenticationService.createWarehouseAssistant(userRequest));
    }

    @Operation(summary = RestConstants.SWAGGER_REGISTER_CUSTOMER_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = RestConstants.CODE_CREATED, description = RestConstants.SWAGGER_REGISTER_CUSTOMER_RESPONSE),
            @ApiResponse(responseCode = RestConstants.CODE_CONFLICT, description = RestConstants.SWAGGER_REGISTER_USER_EMAIL_EXISTS),
            @ApiResponse(responseCode = RestConstants.CODE_CONFLICT, description = RestConstants.SWAGGER_REGISTER_USER_IDENTITY_DOCUMENT_EXISTS),
            @ApiResponse(responseCode = RestConstants.CODE_CONFLICT, description = RestConstants.SWAGGER_REGISTER_USER_UNDERAGE),
            @ApiResponse(responseCode = RestConstants.CODE_BAD_REQUEST, description = RestConstants.SWAGGER_VALIDATIONS_DONT_PASS),
    })
    @PostMapping("/register/customer")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<RegisterResponse> registerCustomer(@RequestBody @Valid UserRequest userRequest){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(authenticationService.createCustomer(userRequest));
    }

    @Operation(summary = RestConstants.SWAGGER_LOGIN_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = RestConstants.CODE_ACCEPTED, description = RestConstants.SWAGGER_LOGIN_RESPONSE),
            @ApiResponse(responseCode = RestConstants.CODE_BAD_REQUEST, description = RestConstants.SWAGGER_LOGIN_ERROR),
            @ApiResponse(responseCode = RestConstants.CODE_BAD_REQUEST, description = RestConstants.SWAGGER_VALIDATIONS_DONT_PASS),
    })
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody @Valid AuthenticationRequest authenticationRequest){
        return ResponseEntity.accepted().body(authenticationService.login(authenticationRequest));
    }

    @Operation(summary = RestConstants.SWAGGER_AUTHORIZATION_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = RestConstants.CODE_ACCEPTED, description = RestConstants.SWAGGER_AUTHORIZATION_RESPONSE),
            @ApiResponse(responseCode = RestConstants.CODE_BAD_REQUEST, description = RestConstants.SWAGGER_VALIDATIONS_DONT_PASS),
    })
    @PostMapping("/authorize")
    public ResponseEntity<AuthorizationResponse> authorize(@RequestBody @Valid AuthorizationRequest authorizationRequest){
        return ResponseEntity.accepted().body(authenticationService.authorize(authorizationRequest));
    }
}

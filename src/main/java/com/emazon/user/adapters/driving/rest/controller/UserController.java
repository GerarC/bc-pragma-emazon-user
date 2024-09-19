package com.emazon.user.adapters.driving.rest.controller;

import com.emazon.user.adapters.driving.rest.dto.response.ExistsUserResponse;
import com.emazon.user.adapters.driving.rest.service.UserService;
import com.emazon.user.adapters.driving.rest.utils.RestConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @Operation(summary = RestConstants.SWAGGER_USER_EXISTS_SUMMARY)
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = RestConstants.CODE_OK,
                    description = RestConstants.SWAGGER_USER_EXISTS_RESPONSE,
                    content = @Content(schema = @Schema(implementation = ExistsUserResponse.class)))
    })
    @GetMapping("/{id}/exist")
    public ResponseEntity<ExistsUserResponse> existsUserById(@PathVariable String id) {
        return ResponseEntity.ok(userService.existsUserById(id));
    }
}

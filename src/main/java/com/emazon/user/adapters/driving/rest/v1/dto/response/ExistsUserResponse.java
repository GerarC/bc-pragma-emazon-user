package com.emazon.user.adapters.driving.rest.v1.dto.response;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExistsUserResponse {
    private boolean exists;
}

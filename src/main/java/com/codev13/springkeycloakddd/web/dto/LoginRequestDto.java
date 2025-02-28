package com.codev13.springkeycloakddd.web.dto;

import lombok.Data;
import lombok.Getter;

public record LoginRequestDto(
        String username,
        String password
) {
}

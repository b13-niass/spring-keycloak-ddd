package com.codev13.springkeycloakddd.web.controller;

import com.codev13.springkeycloakddd.web.dto.LoginRequestDto;
import com.codev13.springkeycloakddd.web.dto.LoginResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthController {
     ResponseEntity<LoginResponseDto> authUser(@RequestBody LoginRequestDto request);
}

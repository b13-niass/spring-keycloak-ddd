package com.codev13.springkeycloakddd.web.controller;

import com.codev13.springkeycloakddd.client.KeycloakAuthRequest;
import com.codev13.springkeycloakddd.client.KeycloakClient;
import com.codev13.springkeycloakddd.config.KeycloakProperties;
import com.codev13.springkeycloakddd.web.dto.LoginRequestDto;
import com.codev13.springkeycloakddd.web.dto.LoginResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthControllerImpl implements AuthController{

    private final KeycloakClient keycloakClient;
    private final KeycloakProperties keycloakProperties;
    private static final Logger logger = LoggerFactory.getLogger(AuthControllerImpl.class);


    @PostMapping("/login")
    @Override
    public ResponseEntity<LoginResponseDto> authUser(@RequestBody @Valid LoginRequestDto request) {
       logger.info(request.username() +" "+ request.password());
        KeycloakAuthRequest keycloakAuthRequest = KeycloakAuthRequest.builder()
                .username(request.username())
                .password(request.password())
                .client_id(keycloakProperties.getClientId())
                .client_secret(keycloakProperties.getClientSecret())
                .grant_type(keycloakProperties.getGrant_type())
                .build();

        LoginResponseDto response =  keycloakClient.getAccessToken(keycloakAuthRequest);
        return ResponseEntity.ok(response);
    }
}

package com.codev13.springkeycloakddd.client;

import com.codev13.springkeycloakddd.web.dto.LoginResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "keycloak", url = "${keycloak.auth-server-url}")
public interface KeycloakClient {
    @RequestMapping(value = "/realms/${keycloak.realm}/protocol/openid-connect/token", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    LoginResponseDto getAccessToken(@RequestBody KeycloakAuthRequest authRequest);
}

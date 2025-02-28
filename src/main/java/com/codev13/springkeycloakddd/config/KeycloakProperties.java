package com.codev13.springkeycloakddd.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "keycloak")
public class KeycloakProperties {
    private String realm;
    private String authServerUrl;
    private String clientId;
    private String clientSecret;
    private final String grant_type = "password";
}

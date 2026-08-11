package net.java21.hello.front.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "gateway")
@Data
public class GatewayProperties {
    private String baseUrl;
}

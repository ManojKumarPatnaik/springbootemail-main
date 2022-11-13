package com.springlearning.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "mail")
@PropertySource(value = "custom.properties")
@Data
@Component
public class MailConfig {

    private String host;
    private String to;
    private String from;
    private String delete;


}

package com.genie.SpringBootP02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDateTime;

@Configuration
public class InstagramConfig {

    @Bean           //return an object to manage by Spring-Boots
    public LocalDateTime getInstance() {
        return LocalDateTime.now();
    }
}

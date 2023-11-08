package org.example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:garage.properties")
public class AppConfig {

    @Bean
    public Mechanic mechanic() {
        return new Mechanic("${mechanic.name}");
    }

    @Bean
    public Tool tool() {
        return new Tool("${tool.name}");
    }
}
package com.example.SKB_DZ_Profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SkbDzProfilesApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(SkbDzProfilesApplication.class, args);
    }
}

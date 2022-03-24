package com.example.SKB_DZ_Profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Profile("test")
@ConfigurationProperties(prefix = "app")
public class IfProfileIsTest {

    private List<String> values;

    @Autowired
    private Environment environment;

    @Value("${spring.application.name}")
    private String appName;

    @PostConstruct
    private void test() {
        System.out.println(
                "----------\n"
                        + "Bean name: "
                        + IfProfileIsTest.class.getName()
                        + "\n"
                        + "Active profile: "
                        + environment.getActiveProfiles()[0]
                        +"\nApp name: "
                        + appName
                        + "\n----------");

        System.out.println("List data: ");
        for (String e : values) {
            System.out.println(e);
        }
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

}

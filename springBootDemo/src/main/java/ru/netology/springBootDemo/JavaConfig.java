package ru.netology.springBootDemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springBootDemo.SystemProfile.DevProfile;
import ru.netology.springBootDemo.SystemProfile.ProductionProfile;
import ru.netology.springBootDemo.SystemProfile.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev",havingValue = "true")
    public SystemProfile devProfile(){
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev",havingValue = "false")
    public SystemProfile productionProfile(){
        return new ProductionProfile();
    }
}

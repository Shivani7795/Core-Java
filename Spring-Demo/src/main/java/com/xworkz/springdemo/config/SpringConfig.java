package com.xworkz.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springdemo.component")
public class SpringConfig {
    public SpringConfig(){
        System.out.println("const in SpringConfig");
    }
}

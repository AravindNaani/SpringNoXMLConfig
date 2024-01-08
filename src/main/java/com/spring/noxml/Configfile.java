package com.spring.noxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.noxml")
@PropertySource(value = "classpath:application.properties")
public class Configfile {

}

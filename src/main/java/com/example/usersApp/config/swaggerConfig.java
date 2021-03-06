package com.example.usersApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class swaggerConfig {
    //swagger document allows you to enter the resources and their routes
    // to finally make or build the request as a get or post
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.usersApp.web.rest"))
                .paths(PathSelectors.any())
                .build();
    }
    //config title and description swagger
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Api Rest for usersApp")
                .version("1.1.0")
                .license("Apache License Version 2.0")
                .build();
    }
}
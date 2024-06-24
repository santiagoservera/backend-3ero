package com.ucc.Crudservice.Swagger;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition


public class SwaggerConfig {
    @Bean
    public OpenAPI api(){
        return new OpenAPI().info(new Info().title("Api de productos").version("1.0")
                .contact(new Contact().name("Santiago Servera").email("santiagoservera21@gmail.com"))
                .license(new License().url("https://github.com/santiagoservera").name("GitHub"))
                .termsOfService("http://www.example.com").description("Api encargada de realizar peticiones a una base de datos de productos")
        );
    }
}

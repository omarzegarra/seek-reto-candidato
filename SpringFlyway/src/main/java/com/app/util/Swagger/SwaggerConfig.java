package com.app.util.Swagger;


import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Candidatos")
                        .version("1.0")
                        .description("Documentación de la API de gestión de candidatos con JWT")
                        .termsOfService("http://swagger.io/terms/")
                        .contact(new Contact().name("Omar Zegarra Balmaceda").email("omarh.zegarra@gmail.com"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
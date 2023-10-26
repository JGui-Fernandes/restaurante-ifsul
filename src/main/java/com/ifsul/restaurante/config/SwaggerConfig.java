package com.ifsul.restaurante.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("Restaurante")
                        .description("API Restaurante IFSUL")
                        .version("0.0.1")
                        .contact(new Contact()
                                .name("João Guilherme Borges Fernandes")
                                .email("joaofernandes.ssnfq@academico.ifsul.edu.br")
                        )
                );
    }
}

package com.algaworks.algafood.core.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                  .allowedMethods("*");   // PADRÃO: .allowedMethods("GET", "HEAD", "POST")
//                .allowedOrigins("*");   //opcional, por padrão fica *
//                .maxAge(30);            //PADRÃO: 30 minutos
    }

}

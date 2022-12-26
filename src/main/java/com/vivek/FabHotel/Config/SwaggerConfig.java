package com.vivek.FabHotel.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {



    @Bean
    public Docket api() {
     return new Docket(DocumentationType.SWAGGER_2)
       .select()
       .apis(RequestHandlerSelectors.any())
       .paths(PathSelectors.any())
       .build();
       
    }
    private ApiInfo apiInfo() {
      return new ApiInfoBuilder()
        .title("testing.......")
        .description("testing......")
        .version("1.1.0")
        .build();
    }
    
}

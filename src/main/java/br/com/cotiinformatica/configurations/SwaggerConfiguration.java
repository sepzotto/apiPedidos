package br.com.cotiinformatica.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfiguration {
	
	@Bean
	OpenAPI customApi() {
		
		var openApi = new OpenAPI()
				.components(new Components())
				.info(new Info()
				.title("API Pedidos - Treinamento TJ/PR Turma 02")
				.description("Curso Java Avançado - Formação Arquiteto COTI Informática")
				.version("v1"));

		return openApi;
	}

}

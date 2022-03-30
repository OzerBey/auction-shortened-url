package com.ozer.auctionshortenedurl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 // initialize the swagger2 when start spring boot
public class AuctionShortenedUrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionShortenedUrlApplication.class, args);
	}

	@Bean // Java classı dır genellikle configurason amaçlı kullanır derlenirken bean
	// anotasyonunu görünce bellege yerleştiriyor requesthandler leri dökumante
	// ediyor bizim için
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ozer.auctionshortenedurl")).build();
	}

}

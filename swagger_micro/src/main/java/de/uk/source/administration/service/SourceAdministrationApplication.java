package de.uk.source.administration.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.ComponentScan;

import com.google.common.base.Predicate;

import de.uk.source.administration.service.rest.SourceAdministrationController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackageClasses = {SourceAdministrationController.class})
public class SourceAdministrationApplication {
	
	public static void main(String[] args){
		SpringApplication.run(SourceAdministrationApplication.class, args);
	}
	
	public Docket sourceAdministrationApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("source-admin-api")
				.apiInfo(apiInfo())
				.select()
				.paths(sourceAdministrationPaths())
				.build();
	}
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Source Administration API")
                .description("The Source Administration API provides an interface to manage your bibliographical"
                		+ "references.")
                .termsOfServiceUrl("http://www.urakel.de")
                .contact(new Contact("UK", "www.urakel.de", "ursula@urakel.de"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/UrsulaK/microservice_experience/LICENSE")
                .version("0.1.0")
                .build();
    }

	private Predicate<String> sourceAdministrationPaths() {
        return regex("/source");
    }
}

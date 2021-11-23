//package vatIT.co.za.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger3
//public class TodoConfiguration {
//	
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors
//						.basePackage("vatIT.co.za.controller"))
//				.paths(PathSelectors.regex("/.*"))
//				.build().apiInfo(metaData());
//	}
//
//	private ApiInfo metaData() {
//
//		return new ApiInfoBuilder().title("Todo API")
//				.description("An API specification for a simple Todo api.")
//				.license("Apache 2.0")
//				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//				.version("1.0.0")
//				.build();
//	}
//
//}

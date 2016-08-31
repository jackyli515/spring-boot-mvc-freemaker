/**
 * 
 */
package cn.com.fardo.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author lmq
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("cn.com.fardo.springboot.web.api"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
				.title("Spring boot中使用Swagger2构建RESTFUL APIs")
				.description("更多Spring Boot相关文章请关注：http://www.163.com")
				.termsOfServiceUrl("http://fardo.com.cn")
				.contact("jackyli")
				.version("1.1").build();
	}
}

package io.groud.spring.elasticsearch.config;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：EnableSwagger2
 * http://localhost:8080/swagger-ui.html
 *
 * @author Li.Wei by 2020/6/2
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean("Elastic 模块")
    public Docket userApis() {
        return new Docket(DocumentationType.SWAGGER_2)
            // .groupName("发号模块")
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
            .paths(PathSelectors.regex(".*"))
            .build();
    }

    /**
     * @return 基本信息，页面展示
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Elastic 模块")
            .description("Elastic 模块接口文档")
            // 联系人实体类
            // .contact(new Contact("名字", "网址", "邮箱"))
            // 版本号
            .version("1.0.0-SNAPSHOT")
            .build();
    }
}

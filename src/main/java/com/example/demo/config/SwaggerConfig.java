package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30) // v2 不同
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller")) // 设置扫描路径
                .build();
    }
}

//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//
//    /**
//     * 设置多个：
//     *
//     * @Bean
//     *     public Docket appApi() {
//     *
//     *         List<Parameter> pars = new ArrayList<>();
//     *         ParameterBuilder token = new ParameterBuilder();
//     *         token.name("token").description("用户令牌").modelRef(new ModelRef("string")).parameterType("header").required(false)
//     *                 .build();
//     *         pars.add(token.build());
//     *
//     *         return new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/app/.*")).build()
//     *                 .globalOperationParameters(pars).apiInfo(pdaApiInfo()).useDefaultResponseMessages(false)
//     *                 .enable(enableSwagger)
//     *                 .groupName("appApi");
//     *
//     *     }
//     *
//     *     @Bean
//     *     public Docket adminApi() {
//     *
//     *         List<Parameter> pars = new ArrayList<>();
//     *         ParameterBuilder token = new ParameterBuilder();
//     *         token.name("token").description("用户令牌").modelRef(new ModelRef("string")).parameterType("header").required(false)
//     *                 .build();
//     *         pars.add(token.build());
//     *         return new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/admin/.*")).build()
//     *                 .globalOperationParameters(pars).apiInfo(pdaApiInfo()).useDefaultResponseMessages(false)
//     *                 .enable(enableSwagger)
//     *                 .groupName("adminApi");
//     *
//     *     }
//     *
//     *
//     * @return
//     */
//
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
//                .apis(RequestHandlerSelectors.basePackage("com.lsqingfeng.action.swagger.controller")).paths(PathSelectors.any())
//                .build().globalOperationParameters(setHeaderToken());
//
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("action-swagger").description("swagger实战").termsOfServiceUrl("")
//                .version("1.0").build();
//    }
//
//    /**
//     * @Description: 设置swagger文档中全局参数
//     * @param
//     * @Date: 2020/9/11 10:15
//     * @return: java.util.List<springfox.documentation.service.Parameter>
//     */
//
//    private List<Parameter> setHeaderToken() {
//        List<Parameter> pars = new ArrayList<>();
//        ParameterBuilder userId = new ParameterBuilder();
//        userId.name("token").description("用户TOKEN").modelRef(new ModelRef("string")).parameterType("header")
//                .required(true).build();
//        pars.add(userId.build());
//        return pars;
//    }
//}

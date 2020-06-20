package io.groud.spring.restdocs;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 描述：
 *
 * @author Li.Wei by 2020/6/20
 */
@SpringBootTest
@ExtendWith({RestDocumentationExtension.class, SpringExtension.class})
public class OrderControllerTests {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(RestDocumentationContextProvider restDocumentation) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
            .apply(documentationConfiguration(restDocumentation)
                .operationPreprocessors())
            .build();
    }

    @Test
    public void getOrder() throws Exception {
        this.mockMvc.perform(
            get("/order/getOrder/1")
                .queryParam("id", "1")
                .param("id", "1")
                .contentType(MediaType.APPLICATION_JSON))
            .andDo(document("{ClassName}/{methodName}"))
            .andDo(MockMvcResultHandlers.print())
            .andDo(MockMvcResultHandlers.log());// 打印请求响应详细日志，可以在控制台看到详细的日志信息
    }

    @Test
    public void listOrder() throws Exception {
        this.mockMvc.perform(
            get("/listOrder")
                .contentType(MediaType.APPLICATION_JSON))
            .andDo(document("{ClassName}/{methodName}"))
            .andDo(MockMvcResultHandlers.print())
            .andDo(MockMvcResultHandlers.log());// 打印请求响应详细日志，可以在控制台看到详细的日志信息
    }

    @Test
    public void mapOrder() throws Exception {
        this.mockMvc.perform(
            get("/mapOrder")
                .contentType(MediaType.APPLICATION_JSON))
            .andDo(document("{ClassName}/{methodName}"))
            .andDo(MockMvcResultHandlers.print())
            .andDo(MockMvcResultHandlers.log());// 打印请求响应详细日志，可以在控制台看到详细的日志信息
    }
}
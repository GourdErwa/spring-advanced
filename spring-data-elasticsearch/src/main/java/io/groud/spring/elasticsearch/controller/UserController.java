package io.groud.spring.elasticsearch.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author Li.Wei by 2020/6/6
 */
@Api(tags = "用户接口")
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/test")
    @ApiOperation("忘记密码-校验手机号-获取验证码")
    public String test() {
        return "hello";
    }
}

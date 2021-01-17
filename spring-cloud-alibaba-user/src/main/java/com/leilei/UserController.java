package com.leilei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author lei
 * @version 1.0
 * @date 2020/12/13 22:08
 * @desc
 */
@RestController
@RefreshScope
@RequestMapping("/user")
public class UserController {
    @Value("${systemInfo.name}")
    private String userName;

    @GetMapping("/find/{userName}/{passWord}")
    public String findUser(@PathVariable("userName") String userName, @PathVariable("passWord") String passWord,
                           HttpServletRequest request) {
        System.out.println(request.getRemoteAddr() + "调用了.......");
        if (Objects.equals("lei", userName) && Objects.equals("123456", passWord)) {
            return "success";
        }
        return "error";
    }

    @GetMapping("/test/refresh")
    public String testRefreshConfig() {
        System.out.println(userName);
        return userName;
    }
}

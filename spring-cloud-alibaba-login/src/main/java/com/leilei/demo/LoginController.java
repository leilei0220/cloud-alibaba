package com.leilei.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lei
 * @version 1.0
 * @date 2020/12/13 22:17
 * @desc
 */
@RestController
public class LoginController {
    public static final String SUCCESS = "success";
    private final UserFeignClient userFeignClient;

    @Autowired
    public LoginController(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        String result = userFeignClient.findOneByUserNameAndPassWord(user.getUserName(), user.getPassWord());
        if (SUCCESS.equals(result)) {
            return "登陆成功啦！！！";
        }
        return "登陆失败";
    }
}

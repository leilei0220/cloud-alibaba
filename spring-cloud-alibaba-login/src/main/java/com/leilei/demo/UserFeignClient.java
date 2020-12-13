package com.leilei.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lei
 * @version 1.0
 * @date 2020/12/13 22:24
 * @desc
 */
@FeignClient(value = "app-user")
public interface UserFeignClient {
    @GetMapping("/user/find/{userName}/{passWord}")
    String findOneByUserNameAndPassWord(@PathVariable("userName") String userName, @PathVariable("passWord") String passWord);
}

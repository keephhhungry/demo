package org.cxyxh.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.cxyxh.model.User;
import org.cxyxh.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ： cxyxh
 * @date : 2021/6/26 17:43
 * @describetion :
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    UserService userService;

    @GetMapping("/find")
    public String findById() {
        User user = userService.findById(1L);
        System.out.println(user.toString());
        return user.toString();
    }

    @GetMapping("/test")
    public String test() {
        System.out.println("test success!");
        return "test success!";
    }

}

package org.cxyxh.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.cxyxh.model.User;
import org.cxyxh.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author ： cxyxh
 * @date : 2021/6/26 17:54
 * @describetion :
 */
@Service(version = "1.0.0", timeout = 10000, interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(1L);
        user.setName("小明");
        user.setAge(15);
        user.setSex("男");
        return user;
    }
}

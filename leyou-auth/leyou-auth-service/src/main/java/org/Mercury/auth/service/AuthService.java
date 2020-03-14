package org.Mercury.auth.service;

import org.Mercury.auth.client.UserClient;
import org.Mercury.auth.config.JwtProperties;
import org.Mercury.auth.entity.UserInfo;
import org.Mercury.auth.utils.JwtUtils;
import org.Mercury.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserClient userClient;

    @Autowired
    private JwtProperties properties;

    public String accredit(String username, String password) {
        //查询user
        User user = userClient.queryUser(username, password);

        //判断user
        if (user == null) {
            return null;
        }

        //jwtUtils生成jwt类型的token
        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setId(user.getId());
            userInfo.setUsername(user.getUsername());
            return JwtUtils.generateToken(userInfo, properties.getPrivateKey(), properties.getExpire());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

package org.Mercury.service;

import org.Mercury.client.UserClient;
import org.Mercury.config.JwtProperties;
import org.Mercury.entity.User;
import org.Mercury.entity.UserInfo;
import org.Mercury.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserClient userClient;

    @Autowired
    private JwtProperties properties;

    public String accredit(String username, String password) {
        User user = userClient.queryUser(username, password);

        return null;
    }
}

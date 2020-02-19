package org.Mercury.service;

import org.Mercury.entity.User;
import org.Mercury.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    /**
     * 校验数据是否可用
     * @param data 要校验的数据
     * @param type 要校验的数据类型：1，用户名；2，手机；
     * @return  true：可用 false：不可用
     */
    public Boolean checkData(String data, Integer type) {
        User record = new User();
        switch (type) {
            case 1:
                record.setUsername(data);
                break;
            case 2:
                record.setPhone(data);
                break;
            default:
                return null;
        }
        return this.userMapper.selectCount(record) == 0;
    }
}

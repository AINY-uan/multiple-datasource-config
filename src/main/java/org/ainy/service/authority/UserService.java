package org.ainy.service.authority;

import lombok.extern.slf4j.Slf4j;
import org.ainy.dao.mapper.authority.UserMapper;
import org.ainy.entity.authority.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 阿拉丁省油的灯
 * @Date 2019-11-06 22:36
 * @Description 用户服务
 */
@Slf4j
@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User selectByPrimaryKey(Object o) throws Exception {

        return userMapper.selectByPrimaryKey(o);
    }

    public int insert(Object o) throws Exception {

        return userMapper.insert(o);
    }
}

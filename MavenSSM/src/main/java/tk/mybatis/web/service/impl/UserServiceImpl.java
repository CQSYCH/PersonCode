package tk.mybatis.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.web.mapper.UserMapper;
import tk.mybatis.web.model.User;
import tk.mybatis.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean registUser(User user){
        boolean isSuccess=false;
        if(user!=null){
            if(userMapper.InsertUser(user)>0){
                isSuccess=true;
            }
        }
        return isSuccess;
    }
}
package tk.mybatis.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.web.model.User;
import tk.mybatis.web.service.impl.UserServiceImpl;
import tk.mybatis.web.tool.Base64Tran;

@Controller
public class homeController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @RequestMapping(value = "InsertUser")
    public ModelAndView InsertUser(User user) {
        System.out.println(Base64Tran.encryptString("Y8W1rjn6"));
        ModelAndView modelView = new ModelAndView();
        User userInfo = new User();
        userInfo.setUserId("826481378");
        userInfo.setUserPass("Admin88");
        userInfo.setAge("85");
        userInfo.setSex("男");
        if (userServiceImpl.registUser(userInfo)) {
            modelView.setViewName("success");
        }else{
            modelView.setViewName("register");
        }
        return modelView;
    }
}

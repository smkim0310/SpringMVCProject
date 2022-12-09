package com.crud.example;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "/WEB-INF/index.jsp";
    }

    public static class UserVO {
        private String userid;
        private String password;
        private String username;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    @Service
    public static class UserServiceImpl {
        @Autowired
        UserDAO userDAO;
        public UserVO getUser(UserVO vo){
            return userDAO.getUser(vo);
        }
    }

    @Repository
    public static class UserDAO {
        @Autowired
        SqlSessionTemplate sqlSession;
        public UserVO getUser(UserVO vo){
            return sqlSession.selectOne("User.getUser",vo);
        }
    }
}

package priv.blog.personal.service;

import priv.blog.personal.entity.Users;

import java.util.List;

public interface UserService {
    //用户注册（添加用户）：提供用户名，密码，邮箱，手机号
    int register(Users user);
    //用户登录：邮箱或者手机登录；
    Users login(String username,String password);
    //通过昵称查询；
    List<Users> searchUserByNick(String nickName);
    //通过ID查询；
    Users searchUserById(Integer integer);
}

package priv.blog.personal.mapper;

import org.apache.ibatis.annotations.Mapper;
import priv.blog.personal.entity.Users;
import java.util.List;

@Mapper
public interface UserMapper {
    //用户注册（添加用户）：提供用户名，密码，邮箱，手机号
    int register(Users user);
    //用户登录：邮箱或者手机登录；
    Users login(String username,String password);
    //通过昵称查询；
    List<Users> searchUserByNick(String nickName);
    //通过ID查询；
    Users searchUserById(Integer id);

//    //添加用户
//    int add_user(Users user);
//
//    //根据id查询
//    Users get_user(int id);
//
//    //根据名字查询
//    List<Users> get_user_byname(String userName);
//
//    //删除用户
//    int del_user(int id);
//
//    //更新用户
//    int update_user(Users user);
//
//    //查询所有
//    List<Users>select_all();
//
//    //登录
//    Users login(Users user);

}

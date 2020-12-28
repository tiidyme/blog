package priv.blog.personal.service.Impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.blog.personal.mapper.UserMapper;
import priv.blog.personal.entity.Users;
import priv.blog.personal.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper usersMapper;


    @Override
    public int register(Users user) {
        return usersMapper.register(user);
    }

    @Override
    public Users login(String username,String password) {
        return usersMapper.login(username,password);
    }

    @Override
    public List<Users> searchUserByNick(String nickName) {
        return usersMapper.searchUserByNick(nickName);
    }

    @Override
    public Users searchUserById(Integer id) {
        return usersMapper.searchUserById(id);
    }
}

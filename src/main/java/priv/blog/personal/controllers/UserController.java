package priv.blog.personal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.blog.personal.entity.Users;
import priv.blog.personal.service.UserService;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "hello")
    public String Hello(){
        return "firstPage";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request) {
        String username = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println(username+password);
        Users user = null;
        if(!username.equals("") && !password.equals("")){
            try {
                user = userService.login(username, password);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(user != null) {
            return user.toString();
        } else {
            return "null";
        }
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ResponseBody
    public void register(HttpServletRequest request){
        String Nickname = request.getParameter("nickName");
        String Account = request.getParameter("account");
        String Password = request.getParameter("password");
        String E_mail = request.getParameter("mail");
        String Phone = request.getParameter("phone");
        String Birthday = request.getParameter("date");
        Timestamp timestampBir = Timestamp.valueOf(Birthday+" 00:00:00");
        System.out.println("Nickname:"+Nickname+
                            "Account:"+Account+
                            "Password:"+Password+
                            "E_mail:"+E_mail+
                            "Phone:"+Phone+
                            "Birthday:"+timestampBir);
//        Users user = new Users(Account,Password,E_mail,Birthday,Phone,Nickname);
    }
}

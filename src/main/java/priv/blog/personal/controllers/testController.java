package priv.blog.personal.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import priv.blog.personal.service.UserService;

@Controller
public class testController {
    @Autowired
    private UserService usersService;

    @RequestMapping(value = "test")
    @ResponseBody
    public String test() {
        return "static/index.html";
    }

}

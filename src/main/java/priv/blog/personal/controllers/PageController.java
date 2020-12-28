package priv.blog.personal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping(value = {"firstPage"})
    public String firstPage() {
        return "firstPage.html";
    }
}

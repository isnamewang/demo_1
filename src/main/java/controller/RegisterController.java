package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class RegisterController  {

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(HttpSession session){

        System.out.println(session.getCreationTime()+"  nihao");
        System.out.println(session.toString());
        return "register";

    }
}

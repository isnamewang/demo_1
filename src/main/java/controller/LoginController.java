package controller;

import bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController  {

    @RequestMapping(value = "/index")
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/login"  ,method = RequestMethod.POST)
    public String login(HttpSession session, Model model, User user){
        if("wanghuan".equals(user.getUsername()) && "123456".equals(user.getPassword())){
            session.setAttribute("user",user);
            return "redirect:success";
        }
        model.addAttribute("msg","用户名或密码错误，请重新登录");

        return "login";
    }
    @RequestMapping(value = "/success",method = RequestMethod.GET)
    public String success(){
        return "success";
    }
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }

}

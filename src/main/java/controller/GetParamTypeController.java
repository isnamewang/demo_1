package controller;


import bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/paramType")
public class GetParamTypeController {

    //接受Servlet参数
    @RequestMapping("/test1")
    public ModelAndView test1(HttpServletRequest request,
                              HttpServletResponse response,
                              HttpSession session){
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String msg = String.format("name:%s,age:%s",name,age);
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("msg",msg);
      return modelAndView;
    }

    //通过方法形参名接受参数，实质也是用servlet的getParameter()方法
    @RequestMapping("/test2")
    public ModelAndView test2(String name,Integer age){
       String msg = String.format("name:%s,age:%s",name,age);
       System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("msg",msg);
       return modelAndView;
    }
    //通过RequestParam进行传递
    @RequestMapping("/test3")
    public ModelAndView test3(@RequestParam("pname") String name,
                              @RequestParam("page")Integer age){
        String msg = String.format("name:%s,age:%s",name,age);
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("msg",msg);
        return modelAndView;
    }
    //通过对象进行传参
    @RequestMapping("/test4")
    public ModelAndView test4(User user){
        String msg = String.format("name:%s,age:%s",user.getUsername(),user.getAge());
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("msg",msg);
        return modelAndView;
    }
    //多个对象传参
    //组合对象传参
    //通过@PathVariable接受Url的参数




}

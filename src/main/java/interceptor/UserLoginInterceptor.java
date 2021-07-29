package interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String url = request.getRequestURI();
        if(url.indexOf("/index")>=0 || url.indexOf("/login")>=0){
            return true;
        }
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if(user!=null){
            return true;
        }
        request.setAttribute("msg","你还没有登录");
      //  System.out.println("xjxjxj");
        request.getRequestDispatcher("/index").forward(request,response);
        return false;
    }
}

package controller;


import bean.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {



    @RequestMapping("/get")
    public String get(){
        return "get";
    }
    @RequestMapping("/post")
    public Map post(HttpServletRequest request){
        return request.getParameterMap();
    }
    @RequestMapping(value = "/body",method = RequestMethod.POST)
    public User List(@RequestBody User user){
        return user;
    }
    @RequestMapping("/put")
    public String put(){
        return "put";
    }
    @PostMapping("/upload")
    public Map upload(@RequestParam("file1")MultipartFile file1,
                      @RequestParam("file2")MultipartFile file2,
                      User user,
                      HttpServletRequest request){
        Map result = new HashMap();
        result.put("file1.size",file1.getSize());
        result.put("file1.name",file1.getName());
        result.put("file1.originalFilename",file1.getOriginalFilename());
        result.put("file2.size",file2.getSize());
        result.put("file2.name",file2.getName());
        result.put("file2.originalFilename",file2.getOriginalFilename());
        return result;
    }


}

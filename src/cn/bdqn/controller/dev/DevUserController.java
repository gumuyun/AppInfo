package cn.bdqn.controller.dev;

import cn.bdqn.pojo.DevUser;
import cn.bdqn.service.DevUserService;
import cn.bdqn.util.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/dev/user")
public class DevUserController {

    @Resource
    private DevUserService devUserService;

    @RequestMapping("/login.html")
    public String login(){
        return "devLogin";
    }

    @RequestMapping(value = "/doLogin.html")
    public String doLogin(@RequestParam(value = "devCode") String devCode,
                          @RequestParam(value = "devPassword")String devPassword,
                          HttpSession session, HttpServletRequest request){
        DevUser devUser = devUserService.login(devCode, devPassword);
        if (devUser!=null){
            //登录成功
            session.setAttribute(Constants.DEV_USER_SESSION,devUser);
            return "redirect:/dev/platform/main.html";
        }
        request.setAttribute("msg","用户或密码不正确！");
        return "devLogin";
    }
}

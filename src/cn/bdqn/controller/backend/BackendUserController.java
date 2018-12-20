package cn.bdqn.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/backend/user")
public class BackendUserController {

    @RequestMapping("/login.html")
    public String login(){
        return "backendLogin";
    }
}

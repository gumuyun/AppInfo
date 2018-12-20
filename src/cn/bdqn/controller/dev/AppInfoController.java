package cn.bdqn.controller.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/dev/platform")
public class AppInfoController {

    @RequestMapping(value = "/main.html")
    public String index(){
        return "dev/main";
    }
}

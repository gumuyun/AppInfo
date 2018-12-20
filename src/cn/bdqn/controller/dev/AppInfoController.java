package cn.bdqn.controller.dev;

import cn.bdqn.pojo.AppInfo;
import cn.bdqn.service.AppInfoService;
import cn.bdqn.util.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/dev/platform")
public class AppInfoController {

    @Resource
    private AppInfoService appInfoService;

    @RequestMapping(value = "/main.html")
    public String index(){
        return "dev/main";
    }
    @RequestMapping(value = "/list.html")
    public String list(@RequestParam(value = "softwareName" ,required = false) String softwareName,
                       @RequestParam(value = "status" ,required = false) Integer status,
                       @RequestParam(value = "platformId" ,required = false) Integer platformId,
                       @RequestParam(value = "categoryLevel1" ,required = false) Integer categoryLevel1,
                       @RequestParam(value = "categoryLevel2" ,required = false) Integer categoryLevel2,
                       @RequestParam(value = "categoryLevel3" ,required = false) Integer categoryLevel3,
                       @RequestParam(value = "pageIndex" ,required = false,defaultValue = "1") Integer pageIndex,
                       @RequestParam(value = "pageSize" ,required = false,defaultValue = "5") Integer pageSize, Model model){
        PageSupport<AppInfo> pageSupport = appInfoService.findPageByCondition(softwareName, status, platformId, categoryLevel1, categoryLevel2, categoryLevel3, pageIndex, pageSize);
        model.addAttribute("pageSupport",pageSupport);
        return "dev/appinfolist";
    }
}

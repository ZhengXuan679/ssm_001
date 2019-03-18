package cn.zhengxuan.controller;

import cn.zhengxuan.pojo.Xsxx;
import cn.zhengxuan.service.XsxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class XsxxController {
    private final  XsxxService xsxxService;

    @Autowired
    public XsxxController(XsxxService xsxxService){
        this.xsxxService=xsxxService;
        System.out.println("==XsxxController构造函数====");
    }

    @RequestMapping(value = "/selectUser",method = RequestMethod.GET)
    public String  selectUser(){
        System.out.println("Action---selectUser");
        List<Xsxx> xsxxes = xsxxService.selectXsxx();
        System.out.println(xsxxes);
        return "success";
    }

    public XsxxService getXsxxService() {
        return xsxxService;
    }


}

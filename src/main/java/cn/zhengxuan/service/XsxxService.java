package cn.zhengxuan.service;

import cn.zhengxuan.pojo.Xsxx;
import cn.zhengxuan.pojo.XsxxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XsxxService {
    private final XsxxMapper xsxxMapper;


    @Autowired
    public XsxxService(XsxxMapper xsxxMapper){
        System.out.println("---XsxxService构造函数---");
        this.xsxxMapper = xsxxMapper;
    }


    public XsxxMapper getXsxxMapper() {
        return xsxxMapper;
    }

    public List<Xsxx> selectXsxx(){
        return xsxxMapper.selectXsxx();
    }


}

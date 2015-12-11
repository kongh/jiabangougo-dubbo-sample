package com.jiabangougo.dubbo.web.controller;

import com.jiabangougo.dubbo.service.DubboConsumerService;
import com.jiabangougo.dubbo.user.UserResultDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/12/7.
 */
@Controller
@RequestMapping(value = "/consumer")
public class DubboConsumerController {

    @Resource(name = "dubboConsumerService")
    private DubboConsumerService dubboConsumerService;

    @RequestMapping(value = "/basic",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return dubboConsumerService.testBasic();
    }

    @RequestMapping(value = "/self",method = RequestMethod.GET)
    @ResponseBody
    public UserResultDTO test2(){
        return dubboConsumerService.testSelf();
    }
}

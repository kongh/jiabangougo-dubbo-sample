package com.jiabangougo.dubbo.service;

import com.jiabangougo.dubbo.data.DubboSampleManager;
import com.jiabangougo.dubbo.user.UserResultDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/12/7.
 */
@Service("dubboConsumerService")
public class DubboConsumerService {

    @Resource(name = "dubboSampleManager")
    private DubboSampleManager manager;

    public String testBasic(){
       return manager.testBasic();
    }

    public UserResultDTO testSelf(){
        return manager.testSelf();
    }
}

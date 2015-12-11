package com.jiabangougo.dubbo.basic;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 基本类型服务默认实现
 */
@Component("defaultBasicDataTypeDemoService")
public class DefaultBasicDataTypeDemoService implements BasicDataTypeDemoService{

    public String whatsYourName() {
        return "JiaBanGouGo";
    }

    public Integer howOldAreYou() {
        return 1;
    }

    public Double howManyTaxPayed() {
        return 0.20;
    }

    public Date whatsYourBirthday() {
        return new Date();
    }
}

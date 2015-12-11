package com.jiabangougo.dubbo.data;

import com.jiabangougo.dubbo.basic.BasicDataTypeDemoService;
import com.jiabangougo.dubbo.self.SelfDefineDataTypeDemoService;
import com.jiabangougo.dubbo.user.UserResultDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component("dubboSampleManager")
public class DubboSampleManager {


    @Resource(name = "basicDataTypeDemoService")
    private BasicDataTypeDemoService basicDataTypeDemoService;

    @Resource(name = "selfDefineDataTypeDemoService")
    private SelfDefineDataTypeDemoService selfDefineDataTypeDemoService;

    public String testBasic() {

        String name = basicDataTypeDemoService.whatsYourName();
        System.out.println("name:" + name);
        Integer age = basicDataTypeDemoService.howOldAreYou();
        System.out.println("age:" + age);
        Double tax = basicDataTypeDemoService.howManyTaxPayed();
        System.out.println("tax:" + tax);
        Date birthday = basicDataTypeDemoService.whatsYourBirthday();
        System.out.println("birthday:" + birthday.getTime());

        return name + "," + age + ',' + tax + ',' + birthday.getTime();
    }

    public UserResultDTO testSelf(){
        UserResultDTO userResultDTO = selfDefineDataTypeDemoService.pleaseTellMeYourInfomation();
        return userResultDTO;
    }
}

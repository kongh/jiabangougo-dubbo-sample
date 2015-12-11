package com.jiabangougo.dubbo.self;

import com.jiabangougo.dubbo.user.User;
import com.jiabangougo.dubbo.user.UserDO;
import com.jiabangougo.dubbo.user.UserResultDTO;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2015/12/7.
 */
@Component("defaultSelfDefineDataTypeDemoService")
public class DefaultSelfDefineDataTypeDemoService implements SelfDefineDataTypeDemoService{

    private User getData(){
        User user = new User();
        user.setAge(1);
        user.setName("JiaBanGouGo");
        user.setBirthday(new Date());
        user.setTax(0.20);
        return user;
    }

    private UserDO getUserDO(User user){
        UserDO userDO = new UserDO();
        userDO.setTax(user.getTax());
        userDO.setBirthday(user.getBirthday());
        userDO.setAge(user.getAge());
        userDO.setName(user.getName());
        return userDO;
    }

    public UserResultDTO pleaseTellMeYourInfomation() {
        UserResultDTO result = new UserResultDTO();
        result.setCode(0);
        result.setMessage("成功");
        result.setUser(getUserDO(getData()));
        return result;
    }
}

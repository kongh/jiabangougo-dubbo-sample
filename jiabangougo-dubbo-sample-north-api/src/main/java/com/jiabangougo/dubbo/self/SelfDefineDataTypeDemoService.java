package com.jiabangougo.dubbo.self;

import com.jiabangougo.dubbo.user.UserResultDTO;

/**
 * 定义服务化接口
 *
 * <p>
 *      自定义数据类型，DTO设计概念
 * <p/>
 */
public interface SelfDefineDataTypeDemoService {

    /**
     * 请告诉我你的用户信息
     *
     * @return
     */
    UserResultDTO pleaseTellMeYourInfomation();
}

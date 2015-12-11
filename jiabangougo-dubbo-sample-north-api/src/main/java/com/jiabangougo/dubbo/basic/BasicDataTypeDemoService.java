package com.jiabangougo.dubbo.basic;

import java.util.Date;

/**
 * 定义服务化接口
 *
 * <p>
 *      基本数据类型
 * <p/>
 */
public interface BasicDataTypeDemoService {

    /**
     * 字符串基本类型
     *
     * @return
     */
    public String whatsYourName();

    /**
     * 整型基本类型
     *
     * @return
     */
    public Integer howOldAreYou();

    /**
     * 双精度基本数据类型
     * @return
     */
    public Double howManyTaxPayed();

    /**
     * 日期类型
     *
     * @return
     */
    public Date whatsYourBirthday();
}

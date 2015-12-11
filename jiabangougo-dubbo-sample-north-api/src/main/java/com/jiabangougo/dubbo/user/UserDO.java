package com.jiabangougo.dubbo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/12/7.
 */
public class UserDO implements Serializable {
    private String name;

    private Integer age;

    private Double tax;

    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

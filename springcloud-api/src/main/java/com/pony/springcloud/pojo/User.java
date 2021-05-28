package com.pony.springcloud.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)//链式写法
/*  例如：
    User user=new User();
    user.setUserName().setUserAge().setUserPhone()......
 */
public class User implements Serializable {
    private Integer id;
    private  String userName;
    private String userAddress;
    private String userPhone;
    private String userEmail;
    private String userIdCard;
    private String userSex;
    private String dbDataSource;
}

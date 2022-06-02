package com.nya.domain;

//lombok 详见https://www.bilibili.com/video/BV15b4y1a7yG?p=34
import lombok.Data;

//用户实体类

@Data
public class User {
    private Integer id;
    private String password;
    private String sex;
    private String nickname;
    private String phone;
    private  Integer issuper;

}

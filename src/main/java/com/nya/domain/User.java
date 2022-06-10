package com.nya.domain;

//lombok 详见https://www.bilibili.com/video/BV15b4y1a7yG?p=34
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

//用户实体类

@Data
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String sid;
    private String password;
    private String nickname;
    private String phone;
    private  Integer issuper;

}

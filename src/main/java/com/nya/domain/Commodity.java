package com.nya.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Commodity {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String cname;
    private String cdescription;
    private String ctype;

}

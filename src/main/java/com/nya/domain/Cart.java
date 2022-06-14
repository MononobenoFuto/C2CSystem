package com.nya.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Cart {
    private Integer cid;
    private Integer buyerid;
    private String status;
    @TableId(type = IdType.AUTO)
    private Integer ol;
}

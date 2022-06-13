package com.nya.domain;

import lombok.Data;

@Data
public class Cart {
    private Integer cid;
    private Integer buyerid;
    private String status;
}

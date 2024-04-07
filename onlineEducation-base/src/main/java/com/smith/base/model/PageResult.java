package com.smith.base.model;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    // 数据列表
    private List<T> items;

    //总记录数
    private long counts;


    private PageParams pageParams;
}

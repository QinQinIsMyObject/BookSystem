package com.ssm.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Celery
 * @Des 图书表
 */
@Data
public class Books {
    /**
     * 图书id
     */
    private Integer bid;
    /**
     * 图书名
     */
    private String bname;
    /**
     * 图书作者
     */
    private String author;
    /**
     * 出版社
     */
    private String publish;
    /**
     * 出版日期
     */
    private Date publishdate;
    /**
     * 页数
     */
    private Integer page;
    /**
     * 价格
     */
    private String price;
    /**
     * 内容摘要
     */
    private Integer content;
}

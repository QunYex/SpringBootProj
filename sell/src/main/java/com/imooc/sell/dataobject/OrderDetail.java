package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;

    /** 订单id. */
    private String orderId;

    /** 商品id. */
    private String productId;

    /** 商品名称. */
    private String productName;

    /** 商品单价. */
    private BigDecimal productPrice;

    /** 商品数量. */
    private Integer productQuantity;

    /** 商品小图. */
    private String productIcon;

    private Date createTime;

    /** 更新时间. */
    private Date updateTime;

}

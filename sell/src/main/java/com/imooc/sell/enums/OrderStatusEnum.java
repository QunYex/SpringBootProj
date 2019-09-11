package com.imooc.sell.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISH(1,"已完成"),
    CANCEL(2,"取消");

    private Integer code;
    private String message;
    OrderStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

}

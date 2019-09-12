package com.imooc.sell.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class OrderForm {

    @NotEmpty(message = "name must")
    private String name;

    @NotEmpty(message = "phone must")
    private String phone;

    @NotEmpty(message = "address must")
    private String address;

    @NotEmpty(message = "openid must")
    private String openId;

    @NotEmpty(message =  "Cart not null")
    private String items;
}

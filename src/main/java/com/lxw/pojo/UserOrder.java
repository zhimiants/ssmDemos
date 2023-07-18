package com.lxw.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
// 订单实体类 (Order.java)
public class UserOrder {
    UserOrder userOrder;
    private int orderId;
    private int userId;
    private LocalDateTime orderDate;
    private BigDecimal totalAmount;
    private String shippingAddress;


}

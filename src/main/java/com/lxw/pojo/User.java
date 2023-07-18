package com.lxw.pojo;

//import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {
    UserProfile userProfile;
    UserOrder userOrder;
    UserPermissions userPermissions;
    private int id;
    private String username;
    private String password;
    private String avatar;
    private String lastIp;
    private LocalDateTime lastAt;
    private Integer status;
    private Integer failTimes;
    private Integer lockExpireTime;
    private BigDecimal balance;
    private LocalDateTime createAt;
    private String createIp;

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public void setUserOrder(UserOrder userOrder) {
        this.userOrder=userOrder;
    }

    public void setUserPermissions(UserPermissions userPermissions) {
        this.userPermissions=userPermissions;
    }
}
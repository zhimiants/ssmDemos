package com.lxw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
// 用户资料实体类 (UserProfile.java)
public class UserProfile {
    User user;
    private int id;
    private int userId;
    private String fullName;
    private String email;
    private String phone;
    private String address;

    public void setUserProfile(User user) {
        this.user = user;
    }

}

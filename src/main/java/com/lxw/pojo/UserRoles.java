package com.lxw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoles{
    private int id;
    private int userId;
    private int roleId;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    // Getters and Setters
}
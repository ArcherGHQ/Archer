package com.example.myjavaee.unity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class Users {
    @TableId(value = "id",type = IdType.AUTO)
    private int userId;
    @TableField("username")
    private String userName;
    @TableField("password")
    private String passwd;
    @TableField("ac")
    private int ac;
}

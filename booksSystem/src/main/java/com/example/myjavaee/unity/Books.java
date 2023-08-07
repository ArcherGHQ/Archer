package com.example.myjavaee.unity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "books")
public class Books {
    @TableId(value = "id", type = IdType.AUTO)
    private int bookId;
    @TableField("bookname")
    private String bookName;
    @TableField("author")
    private String author;
    @TableField("price")
    private Double price;
    @TableField("number")
    private int count;
}

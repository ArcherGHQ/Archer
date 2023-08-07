package com.example.myjavaee.unity;

import lombok.Data;

import java.util.List;

@Data
public class MyPage {
    private Integer page;
    private List<Users> users;
    private List<Books> books;
    private Integer size;
    private long total;
}

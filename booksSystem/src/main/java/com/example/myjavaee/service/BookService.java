package com.example.myjavaee.service;

import com.example.myjavaee.unity.Books;
import com.example.myjavaee.unity.MyPage;
import com.example.myjavaee.unity.Users;

import java.util.List;

public interface BookService {
    MyPage getAllBooks(MyPage page);
    boolean deleteBookById(Integer id);
    boolean updateBook();
    boolean login(Users users);
}

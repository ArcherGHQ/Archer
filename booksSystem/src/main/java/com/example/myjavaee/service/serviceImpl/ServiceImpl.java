package com.example.myjavaee.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.myjavaee.mapper.BookMapper;
import com.example.myjavaee.mapper.UserMapper;
import com.example.myjavaee.service.BookService;
import com.example.myjavaee.unity.Books;
import com.example.myjavaee.unity.MyPage;
import com.example.myjavaee.unity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Resource
    private UserMapper userMapper;
    @Override
    public MyPage getAllBooks(MyPage myPage) {
        Integer current = myPage.getPage();
        Integer size = myPage.getSize();
        IPage<Books> page = new Page<>(current,size);
        QueryWrapper queryWrapper = new QueryWrapper();
        bookMapper.selectPage(page,queryWrapper);
        myPage.setPage(current);
        myPage.setSize(size);
        myPage.setBooks(page.getRecords());
        myPage.setTotal(page.getTotal());
        return myPage;
    }
    //图书删除操作
    @Override
    public boolean deleteBookById(Integer id) {
        return bookMapper.deleteById(id)>0?true:false;
    }
    //图书修改操作
    @Override
    public boolean updateBook() {
        return false;
    }

    @Override
    public boolean login(Users users) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",users.getUserName());
        queryWrapper.eq("password",users.getPasswd());
        if(userMapper.selectCount(queryWrapper)>0){
            return true;
        }
        return false;
    }
}

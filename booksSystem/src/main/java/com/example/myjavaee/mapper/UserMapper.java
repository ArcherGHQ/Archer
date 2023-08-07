package com.example.myjavaee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.myjavaee.unity.Users;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;

@Resource
@Mapper
public interface UserMapper extends BaseMapper<Users> {
}

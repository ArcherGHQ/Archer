package com.example.myjavaee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.myjavaee.unity.Books;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BookMapper extends BaseMapper<Books> {
}

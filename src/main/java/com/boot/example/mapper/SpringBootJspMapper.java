package com.boot.example.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpringBootJspMapper {
	String selectTest();
}

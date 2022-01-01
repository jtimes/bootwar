package com.ex.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ex.demo.dao.TestVO;

@Mapper
public interface TestMapper {

	List<TestVO> selectList() throws Exception;
	
}

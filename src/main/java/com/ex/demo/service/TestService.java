package com.ex.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ex.demo.dao.TestVO;
import com.ex.demo.mapper.TestMapper;

@Service
public class TestService {

	@Resource
	private TestMapper testMapper;
	
	public List<TestVO> getList() throws Exception {
		return testMapper.selectList();
	}
	
}

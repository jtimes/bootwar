package com.ex.demo.dao;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("testVO")
public class TestVO {

	public String title;
	public String name;
}

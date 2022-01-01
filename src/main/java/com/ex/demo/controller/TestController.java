package com.ex.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ex.demo.dao.TestVO;
import com.ex.demo.service.TestService;

@Controller
public class TestController {

	@Resource
	private TestService testSvc;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) throws Exception {
		List<TestVO> testList = new ArrayList<>();
		testList = testSvc.getList();

		model.addAttribute("testList", testList);

		return "index";
	}
	
}

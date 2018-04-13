package com.huishu.file.FileServer.controller.test;

import com.huishu.file.FileServer.service.NestingService1;
import com.huishu.file.FileServer.service.NestingService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试事务的嵌套
 *
 * @author yindq
 */
@RestController
@RequestMapping("/test")
public class NestingTest {
	@Autowired
	public NestingService1 nestingService1;
	@Autowired
	public NestingService2 nestingService2;

	@RequestMapping("/test1")
	public void test1(){
		nestingService1.add();
	}

	@RequestMapping("/test2")
	public void test2(){
		nestingService2.add();
	}
}

package com.jiang.serviceTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jiang.pojo.SysDept;
import com.jiang.pojo.SysDeptDto;
import com.jiang.service.SysDeptService;

@ContextConfiguration(locations = { "classpath:spring/spring-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)

public class SysDeptServiceTest {

	@Autowired
	SysDeptService depservice;
	
	@Test
	public void test1() {
		SysDept moden = new SysDept();
		moden.setName("jiang");
		moden.setSeq(1);
		System.out.println(depservice);
		depservice.saveDept(moden);
		
	} 
	
	
	@Test
	public void test2() {
		List<SysDept> list = this.depservice.getAllDepts();
		System.out.println(list.size());
	}
	
	
	@Test
	public void test3() {
		List<SysDeptDto> list = this.depservice.createThree();
		System.out.println(list);
	}
}
package com.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.entity.Teacher;
import com.test.repository.TeacherRepository;

@SpringBootTest
class SchoolManagementApplicationTests {
	
	@Autowired
	TeacherRepository tr;

	@Test
	void contextLoads() {
	}
	
	

}

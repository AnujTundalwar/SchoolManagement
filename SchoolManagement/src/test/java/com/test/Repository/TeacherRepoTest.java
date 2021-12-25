package com.test.Repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.entity.Teacher;
import com.test.repository.TeacherRepository;

@SpringBootTest
public class TeacherRepoTest 
{
	@Autowired
	TeacherRepository tr;
	@Test
	void isPersonExistById()
	{
	Boolean actual=tr.existsById(1);
	//actual=false;
	assertThat(actual).isTrue();
	}
	
	@Test
	void finfAllTest()
	{
		List<Teacher> actual=tr.findAll();
		//actual=null;
		assertThat(actual).isNotNull().isNotEmpty();
		
	}

}

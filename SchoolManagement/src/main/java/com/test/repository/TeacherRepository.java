package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{
	
	

}

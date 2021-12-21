package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Teacher;
import com.test.repository.TeacherRepository;

@RestController
public class TeacherController 
{
	@Autowired
	TeacherRepository tr;
	@GetMapping("/getAll")
	public List<Teacher> getAllTeacher()
	{
	   return tr.findAll();	
		
	}
	
	@GetMapping("/getAll/{tid}")
	public Teacher getTeacher(@PathVariable int tid)
	{
		return tr.findById(tid).orElse(null);
	}
	
	@PostMapping("/addTeacher")
	public String addTeacher(@RequestBody Teacher teacher)
	{
		Teacher t=tr.save(teacher);
		if(t.getTid()==teacher.getTid())
			return "success";
		else
			return "failed";
	}
	
	@PutMapping("/updateUser")
	public List<Teacher> updateTeacher(@RequestBody Teacher teacher)
	{
		tr.save(teacher);
		return tr.findAll();
	}
	
	@DeleteMapping("/deleteTeacher/{Id}")
	public List<Teacher> deleteTeacher(@PathVariable int tid)
	{
	   tr.delete(tr.getById(tid));	
	   return tr.findAll();
	}
}

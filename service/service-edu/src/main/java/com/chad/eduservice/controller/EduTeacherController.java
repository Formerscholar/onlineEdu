package com.chad.eduservice.controller;

import com.chad.eduservice.model.Teacher;
import com.chad.eduservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/findAll")
	public List<Teacher> list() {
		return teacherService.list();
	}
	
	@DeleteMapping("/deleteTeacherById/{id}")
	public boolean deleteTeacherById(@PathVariable String id){
		return teacherService.removeById(id);
	}
}

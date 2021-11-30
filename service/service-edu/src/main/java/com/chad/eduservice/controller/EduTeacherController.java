package com.chad.eduservice.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chad.commonutils.R;
import com.chad.eduservice.model.Teacher;
import com.chad.eduservice.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eduservice/edu-teacher")
@Api("讲师管理")
public class EduTeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/findAll")
	@ApiOperation(value = "所有讲师列表")
	public R list(@ApiParam(name = "page", value = "当前页码", required = true) @RequestParam Long page,
	              @ApiParam(name = "limit", value = "每页记录数", required = true) @RequestParam Long limit) {
		Page<Teacher> teacherPage = new Page<>(page, limit);
		teacherService.page(teacherPage);
		List<Teacher> records = teacherPage.getRecords();
		long total = teacherPage.getTotal();
		return R.ok().data("total", total).data("rows", records);
	}
	
	@DeleteMapping("/deleteTeacherById/{id}")
	@ApiOperation(value = "根据ID删除讲师")
	public R deleteTeacherById(@PathVariable String id) {
		teacherService.removeById(id);
		return R.ok();
	}
}

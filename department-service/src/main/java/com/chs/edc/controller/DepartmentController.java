package com.chs.edc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chs.edc.entity.Department;
import com.chs.edc.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	
	
	@GetMapping("/{id}")
	public Department findByDepartmentId(@PathVariable("id") Long departmentId) {
		log.info("inside findByDepartmentId method of DepartmentController");
		return departmentService.findByDepartmentId(departmentId);
	}
	

}

package com.chs.edc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chs.edc.entity.Department;
import com.chs.edc.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public  Department saveDepartment(Department department) {
		log.info("inside saveDepartment of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long departmentId) {
		log.info("inside findByDepartmentId of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}

}

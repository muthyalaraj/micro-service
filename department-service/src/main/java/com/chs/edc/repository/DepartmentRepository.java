package com.chs.edc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chs.edc.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	Department findByDepartmentId (Long departmentId);
	

}

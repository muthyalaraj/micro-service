package com.chs.edc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chs.edc.VO.Department;
import com.chs.edc.VO.ResponseTemplateVO;
import com.chs.edc.entity.Users;
import com.chs.edc.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	public  Users saveUser(Users user) {
		log.info("inside saveUser of UserRepository");
		return userRepository.save(user);
	}

	

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		
		log.info("inside getUserWithDepartment of UserService");
		String url="http://DEPARTMENT-SERVICE/departments/{id}";
		ResponseTemplateVO vo=new ResponseTemplateVO();
		Users user=userRepository.findByUserId(userId); 
		
		Department department = restTemplate.getForObject(url, Department.class, user.getDepartmentId());
		
		vo.setUsers(user);
		vo.setDepartment(department);
		
		return vo;
	}

}

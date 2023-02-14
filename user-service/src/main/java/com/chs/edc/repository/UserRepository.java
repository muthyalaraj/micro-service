package com.chs.edc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chs.edc.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	
	Users findByUserId(Long userId);
	

}

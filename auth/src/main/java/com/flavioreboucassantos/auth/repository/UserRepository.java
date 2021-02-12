package com.flavioreboucassantos.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flavioreboucassantos.auth.entity.Permission;
import com.flavioreboucassantos.auth.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE u.userName =:userName")
	public User findByUserName(@Param("userName") String userName);	

}

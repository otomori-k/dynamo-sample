package com.example.repositories;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.example.model.User;

@EnableScan
public interface UserRepository extends CrudRepository<User, String> {
	List<User> findByName(String name);
}

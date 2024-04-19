package com.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.main.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}

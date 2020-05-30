package com.example.demo.server.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.server.repository.data.User;



public interface DmUserRepository extends CrudRepository<User, String> {

}

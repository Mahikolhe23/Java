package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.User;

public interface UsersRepo extends JpaRepository<User, Integer> {

}

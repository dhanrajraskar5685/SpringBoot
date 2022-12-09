package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;


@Repository
public interface LoginRepositry extends JpaRepository<Login, Integer> {

	Login findByUnameAndUpass(String uname, String upass);

}
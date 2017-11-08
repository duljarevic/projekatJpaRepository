package com.dejan.dejan.repository;

import com.dejan.dejan.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomeRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);



}

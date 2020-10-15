package com.demo.jullia.springApp.dao.julliaDemo;

import com.demo.jullia.springApp.model.julliaDemo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    List<User> findByEmail(String email);

}

package com.dyh.edu.demo.Repository;

import com.dyh.edu.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    User findById(int id);


}

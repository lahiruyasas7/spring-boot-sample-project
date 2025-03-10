package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<User, Integer> { //here need to add types, that created User model type and user model's primary key's data type

}

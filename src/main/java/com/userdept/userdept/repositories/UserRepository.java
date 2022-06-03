package com.userdept.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userdept.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}

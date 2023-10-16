package com.jonatan777.maruin.fc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jonatan777.maruin.fc.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
Optional<User> findByLogin(String login);
Optional<User> findById(int id);

}
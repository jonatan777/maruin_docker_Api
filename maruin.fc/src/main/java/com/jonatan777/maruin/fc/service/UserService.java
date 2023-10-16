package com.jonatan777.maruin.fc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jonatan777.maruin.fc.model.User;
import com.jonatan777.maruin.fc.repository.UserRepository;

@Service
public class UserService  {

  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  // lista todos usuarios
  public List<User> listAllUsers() {
    return userRepository.findAll();
  }

  // buscar um usuário no banco referente ao id ou retorna um notFound
  public Optional<User> getUserId(Long id) {
    return userRepository.findById(id);
  }

  // buscar um usuário no banco referente ao login ou retorna um notFound
   public Optional<User> getUserLogin(String login) {
    return userRepository.findByLogin(login);
  }


  // salva um usuário no banco
  public User AddUser(User user) {
    return userRepository.save(user);
  }


}
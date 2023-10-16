package com.jonatan777.maruin.fc.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonatan777.maruin.fc.model.User;
import com.jonatan777.maruin.fc.repository.UserRepository;
import com.jonatan777.maruin.fc.service.UserService;

import lombok.val;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    UserController(UserService userService) {
        this.userService = userService;
    }

     // buscar todos registros com gols > 0
	@GetMapping(path = { "/todos" })
	public List<User> findNomes() {
		return userService.listAllUsers();
	}

     //  @RequestMapping(value = "/rest/create/document", produces = "text/plain;charset=UTF-8")
    @GetMapping(path = {"/{id}"})
public ResponseEntity<User> findById(@PathVariable long id){
   return userRepository.findById(id)
           .map(record -> ResponseEntity.ok().body(record))
           .orElse(ResponseEntity.notFound().build());
}




@GetMapping(path = {"/get/jogador/{login}"})
    public ResponseEntity<User> getLoginDetails(@PathVariable("login") String login) {
     final Optional<User> user = userService.getUserLogin(login);
        return user
               .map(record -> ResponseEntity.ok().body(record))
               .orElse(ResponseEntity.notFound().build());
                
    }



 @PostMapping
    public ResponseEntity<User> salvar(@RequestBody @val User user) {
        userService.AddUser(user);
       
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}

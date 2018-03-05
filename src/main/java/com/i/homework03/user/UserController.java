
package com.i.homework03.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/api/user/list")
    Collection<User> users() {
        return this.userRepository.findAll();
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public Optional<User> getUserById(@PathVariable("id") long id) {
        return this.userRepository.findById(id);
    }


    @RequestMapping(value = "/api/user/update", method = RequestMethod.POST)
    public ResponseEntity<User> update(@RequestBody User user) {
        User user=new User();
    return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    public void user(@RequestBody User user) {
        UserRepository.add(person);
    }

}





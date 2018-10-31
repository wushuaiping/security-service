package io.wooo.securitydemo.service;

import io.wooo.securitydemo.entity.User;
import io.wooo.securitydemo.entity.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wushuaiping
 * @date: 2018-10-31 16:47
 * @description:
 */
@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

}
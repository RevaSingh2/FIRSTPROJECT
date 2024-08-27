package com.maersk.firstproject.service;

import com.maersk.firstproject.dto.UserDto;
import com.maersk.firstproject.entities.User;
import com.maersk.firstproject.repository.UserRepository;
import com.maersk.firstproject.service.interfaceimpl.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setCity(userDto.getCity());
        user.setStatus(userDto.getStatus());
        userRepository.save(user);
        return user;
    }
    @Override
    public Optional<User> readUser(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(int id, UserDto userDto) {
        if (userDto == null) {
            throw new IllegalArgumentException("UserDto cannot be null");
        }

        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));

        user.setName(userDto.getName());
        user.setCity(userDto.getCity());
        user.setStatus(userDto.getStatus());

        // Save the updated user
        userRepository.save(user);

        return user;
    }


    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}

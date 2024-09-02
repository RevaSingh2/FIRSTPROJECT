package com.maersk.firstproject.service;

import com.maersk.firstproject.dto.UserDto;
import com.maersk.firstproject.entities.AppUser;
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
    public AppUser createUser(UserDto userDto) {
        AppUser appUser = new AppUser();
        appUser.setName(userDto.getName());
        appUser.setCity(userDto.getCity());
        appUser.setStatus(userDto.getStatus());
        userRepository.save(appUser);
        return appUser;
    }
    @Override
    public Optional<AppUser> readUser(int id) {
        return userRepository.findById(id);
    }

    @Override
    public AppUser updateUser(int id, UserDto userDto) {
        if (userDto == null) {
            throw new IllegalArgumentException("UserDto cannot be null");
        }

        AppUser appUser = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));

        appUser.setName(userDto.getName());
        appUser.setCity(userDto.getCity());
        appUser.setStatus(userDto.getStatus());

        // Save the updated user
        userRepository.save(appUser);

        return appUser;
    }


    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}

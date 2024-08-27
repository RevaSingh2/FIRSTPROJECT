package com.maersk.firstproject.service.interfaceimpl;

import com.maersk.firstproject.dto.UserDto;
import com.maersk.firstproject.entities.User;

import java.util.Optional;

public interface UserService {

    User createUser(UserDto userDto);

    Optional<User> readUser(int id);

    User updateUser(int id, UserDto userDto);

    void deleteUser(int id);
}

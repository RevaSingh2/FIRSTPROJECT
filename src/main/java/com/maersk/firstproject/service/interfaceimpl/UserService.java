package com.maersk.firstproject.service.interfaceimpl;

import com.maersk.firstproject.dto.UserDto;
import com.maersk.firstproject.entities.AppUser;

import java.util.Optional;

public interface UserService {

    AppUser createUser(UserDto userDto);

    Optional<AppUser> readUser(int id);

    AppUser updateUser(int id, UserDto userDto);

    void deleteUser(int id);
}

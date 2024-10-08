package com.maersk.firstproject.repository;

import com.maersk.firstproject.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {

}

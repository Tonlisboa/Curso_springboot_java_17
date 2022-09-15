package com.tonlisboa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tonlisboa.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

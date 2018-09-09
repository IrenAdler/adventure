package com.project.adventure.controller;

import com.project.adventure.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepos extends CrudRepository<User, Integer> {
}

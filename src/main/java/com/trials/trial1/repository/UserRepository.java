package com.trials.trial1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trials.trial1.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

package com.daironh.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daironh.security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public abstract Optional<User> findByName(String name);
}

package com.domainexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domainexample.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@SuppressWarnings("unchecked")
	User save(User user);
}

package com.dxc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Role;
import com.dxc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByEmailAndPasswordAndRole(String email,String password,String role);
	boolean existsByEmail(String email);

}

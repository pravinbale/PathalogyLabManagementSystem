package com.lifelinepathlab.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lifelinepathlab.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByRole(String role);
	
	public User findByEmailId(String email);

}

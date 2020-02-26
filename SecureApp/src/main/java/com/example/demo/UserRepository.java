/**
 * 
 */
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hp
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}

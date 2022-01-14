package tiago.costa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tiago.costa.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}

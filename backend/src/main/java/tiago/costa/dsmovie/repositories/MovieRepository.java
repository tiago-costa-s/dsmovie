package tiago.costa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tiago.costa.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

package tiago.costa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tiago.costa.dsmovie.entities.Score;
import tiago.costa.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

		
}

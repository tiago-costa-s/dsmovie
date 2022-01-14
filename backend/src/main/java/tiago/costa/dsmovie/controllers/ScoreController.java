package tiago.costa.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tiago.costa.dsmovie.dto.MovieDTO;
import tiago.costa.dsmovie.dto.ScoreDTO;
import tiago.costa.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {	
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){		
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
	

}


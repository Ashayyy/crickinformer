package com.app.controller;

import java.util.List;

import org.apache.coyote.http11.Http11AprProtocol;
import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Match;
import com.app.service.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

	private MatchService matchservice;
	
	@Autowired
	public MatchController(MatchService matchservice) {
		this.matchservice = matchservice;
	}

	// get live matches
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatchScore()  {
		return new ResponseEntity<>(this.matchservice.getLiveMatchScore(),HttpStatus.OK);	
	}
	
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(this.matchservice.getAllMatches(),HttpStatus.OK);
	}
	
	@GetMapping("/cwc2023pointstable")
	public ResponseEntity<List<List<String>>> cwc2023pointstable(){
		return new ResponseEntity<>(matchservice.getPointsTable(),HttpStatus.OK);
	}
	
	
}

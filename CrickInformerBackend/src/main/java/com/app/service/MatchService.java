package com.app.service;

import java.util.List;
import java.util.Map;

import com.app.entities.Match;



//for loose coupling
public interface MatchService {
   // get all matches
	List<Match> getAllMatches();
	// get live matches
	List<Match> getLiveMatchScore();
	// get cricket ipl 2024
	List<List<String>> getPointsTable();
	// get cricket news
	List<>
	void updateMatchinDB(Match match1);
	
}

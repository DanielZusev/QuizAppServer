package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.boundary.QuestionScoreBoundary;
import com.example.service.QuestionScoreService;

@RestController
public class QuestionScoreController {
	
	private QuestionScoreService questionScoreService;

	@Autowired
	public QuestionScoreController(QuestionScoreService questionScoreService) {
		this.questionScoreService = questionScoreService;
	}

	@RequestMapping(path = "/score/{playerEmail}",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)

	public List<QuestionScoreBoundary> getAllQuestionsScores(@PathVariable("playerEmail") String playerEmail) {
		return questionScoreService.getAllScores(playerEmail);
	}
	
	@RequestMapping(path = "/score/category/{categoryId}/{playerEmail}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)

	public QuestionScoreBoundary getQuestionScoreByCategoryId(@PathVariable("categoryId") String categoryId, @PathVariable("playerEmail") String playerEmail) {
		return questionScoreService.getScoreByCategoryId(categoryId, playerEmail);
	}

	
	@RequestMapping(path = "/score/update",
			method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)

	public void updateScore(@RequestBody QuestionScoreBoundary newScore) {
		questionScoreService.updateScore(newScore);
	}
}

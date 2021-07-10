package com.example.service;

import java.util.List;

import com.example.boundary.QuestionScoreBoundary;


public interface QuestionScoreService {

	public List<QuestionScoreBoundary> getAllScores(String playerEmail);

	public QuestionScoreBoundary getScoreByCategoryId(String categoryId, String player);

	public void updateScore(QuestionScoreBoundary newScore);

}

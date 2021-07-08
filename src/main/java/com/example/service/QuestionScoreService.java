package com.example.service;

import java.util.List;

import com.example.boundary.QuestionScoreBoundary;

public interface QuestionScoreService {

	List<QuestionScoreBoundary> getAllScores(String playerEmail);

	List<QuestionScoreBoundary> getAllScoresByCategoryId(String categoryId);

}

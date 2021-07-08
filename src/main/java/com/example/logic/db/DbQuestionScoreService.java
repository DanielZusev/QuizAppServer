package com.example.logic.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boundary.QuestionScoreBoundary;
import com.example.converter.QuestionScoreEntityConverter;
import com.example.dao.QuestionScoreDao;
import com.example.service.QuestionScoreService;

@Service
public class DbQuestionScoreService implements QuestionScoreService{
	
	private QuestionScoreDao questionScoreDao;
	private QuestionScoreEntityConverter questionScoreEntityConverter;
	
	@Autowired
	public DbQuestionScoreService(QuestionScoreDao questionScoreDao, QuestionScoreEntityConverter questionScoreEntityConverter) {
		this.questionScoreDao = questionScoreDao;
		this.questionScoreEntityConverter = questionScoreEntityConverter;
	}

	@Override
	public List<QuestionScoreBoundary> getAllScores(String playerEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionScoreBoundary> getAllScoresByCategoryId(String categoryId) {
		// TODO Auto-generated method stub
		return null;
	}


}

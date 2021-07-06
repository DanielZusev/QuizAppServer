package com.example.logic.db;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.boundary.QuestionBoundary;
import com.example.converter.QuestionEntityConverter;
import com.example.dao.QuestionDao;
import com.example.service.QuestionService;

public class DbQuestionService implements QuestionService {

	private QuestionDao questionDao;
	private QuestionEntityConverter questionEntityConverter;
	
	@Autowired
	public DbQuestionService(QuestionDao questionDao, QuestionEntityConverter questionEntityConverter) {
		this.questionDao = questionDao;
		this.questionEntityConverter = questionEntityConverter;
	}

	@Override
	public List<QuestionBoundary> getAll() {

		return StreamSupport.stream(this.questionDao.findAll().spliterator(), false)
				.map(this.questionEntityConverter::fromEntity).collect(Collectors.toList());
	}

	@Override
	public List<QuestionBoundary> getAllByCategoryId(String categoryId) {
		
		return StreamSupport.stream(this.questionDao.findByCategoryId(categoryId).spliterator(), false)
				.map(this.questionEntityConverter::fromEntity).collect(Collectors.toList());
	}

	@Override
	public QuestionBoundary getById(String questionId) {
		
		return this.questionEntityConverter.fromEntity(this.questionDao.findByQuestionId(questionId));
	}

}

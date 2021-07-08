package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.boundary.QuestionBoundary;
import com.example.service.QuestionService;

@RestController
public class QuestionController {

	private QuestionService questionService;

	@Autowired
	public QuestionController(QuestionService questionService) {
		this.questionService = questionService;
	}

	@RequestMapping(path = "/questions",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)

	public List<QuestionBoundary> getAllQuestions() {
		return questionService.getAll();
	}
	
	@RequestMapping(path = "/questions/category/{categoryId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)

	public List<QuestionBoundary> getAllQuestionsByCategoryId(@PathVariable("categoryId") String categoryId) {
		return questionService.getAllByCategoryId(categoryId);
	}
	
	@RequestMapping(path = "/questions/{questionId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)

	public QuestionBoundary getQuestionsByQuestionId(@PathVariable("questionId") String questionId) {
		return questionService.getById(questionId);
	}
	
}

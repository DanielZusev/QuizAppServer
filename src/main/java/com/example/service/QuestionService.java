package com.example.service;

import java.util.List;

import com.example.boundary.QuestionBoundary;

public interface QuestionService {

	public List<QuestionBoundary> getAll();

	public List<QuestionBoundary> getAllByCategoryId(String categoryId);

	public QuestionBoundary getById(String questionId);

}

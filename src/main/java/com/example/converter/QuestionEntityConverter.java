package com.example.converter;

import com.example.boundary.QuestionBoundary;
import com.example.entity.QuestionEntity;

public class QuestionEntityConverter {

	public QuestionBoundary fromEntity(QuestionEntity questionEntity) {

		return new QuestionBoundary(questionEntity.getQuestionId(),
				questionEntity.getCategoryId(),
				questionEntity.getQuestion(),
				questionEntity.getAnswerA(),
				questionEntity.getAnswerB(),
				questionEntity.getAnswerC(),
				questionEntity.getAnswerD(),
				questionEntity.getCorrectAnswer(),
				questionEntity.getIsImageQuestion());
				
	}

	public QuestionEntity toEntity(QuestionBoundary questionBoundary) {

		QuestionEntity questionEntity = new QuestionEntity();

		questionEntity.setQuestionId(questionBoundary.getQuestionId());
		questionEntity.setCategoryId(questionBoundary.getCategoryId());
		questionEntity.setQuestion(questionBoundary.getQuestion());
		questionEntity.setAnswerA(questionBoundary.getAnswerA());
		questionEntity.setAnswerB(questionBoundary.getAnswerB());
		questionEntity.setAnswerC(questionBoundary.getAnswerC());
		questionEntity.setAnswerD(questionBoundary.getAnswerD());
		questionEntity.setCorrectAnswer(questionBoundary.getCorrectAnswer());
		questionEntity.setIsImageQuestion(questionBoundary.getIsImageQuestion());

		return questionEntity;
	}

}

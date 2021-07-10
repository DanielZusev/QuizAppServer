package com.example.converter;

import org.springframework.stereotype.Component;

import com.example.boundary.QuestionScoreBoundary;
import com.example.entity.QuestionScoreEntity;

@Component
public class QuestionScoreEntityConverter {
	
	public QuestionScoreBoundary fromEntity(QuestionScoreEntity questionScoreEntity) {

		return new QuestionScoreBoundary(questionScoreEntity.getQuestionScore(),
				questionScoreEntity.getPlayer(),
				questionScoreEntity.getScore(),
				questionScoreEntity.getCategoryId(),
				questionScoreEntity.getCategoryName());
				
	}

	public QuestionScoreEntity toEntity(QuestionScoreBoundary questionScoreBoundary) {

		QuestionScoreEntity questionScoreEntity = new QuestionScoreEntity();

		questionScoreEntity.setQuestionScore(questionScoreBoundary.getQuestionScore());
		questionScoreEntity.setPlayer(questionScoreBoundary.getPlayer());
		questionScoreEntity.setScore(questionScoreBoundary.getScore());
		questionScoreEntity.setCategoryId(questionScoreBoundary.getCategoryId());
		questionScoreEntity.setCategoryName(questionScoreBoundary.getCategoryName());
		

		return questionScoreEntity;
	}

}

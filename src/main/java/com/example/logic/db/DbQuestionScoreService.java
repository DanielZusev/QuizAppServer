package com.example.logic.db;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.boundary.QuestionScoreBoundary;
import com.example.converter.QuestionScoreEntityConverter;
import com.example.dao.QuestionScoreDao;
import com.example.entity.QuestionScoreEntity;
import com.example.service.QuestionScoreService;

@Service
public class DbQuestionScoreService implements QuestionScoreService {

	private QuestionScoreDao questionScoreDao;
	private QuestionScoreEntityConverter questionScoreEntityConverter;

	@Autowired
	public DbQuestionScoreService(QuestionScoreDao questionScoreDao,
			QuestionScoreEntityConverter questionScoreEntityConverter) {
		this.questionScoreDao = questionScoreDao;
		this.questionScoreEntityConverter = questionScoreEntityConverter;
	}

	@Override
	@Transactional(readOnly = true)
	public List<QuestionScoreBoundary> getAllScores(String playerEmail) {

		return StreamSupport.stream(this.questionScoreDao.findAllByPlayer(playerEmail).spliterator(), false)
				.map(this.questionScoreEntityConverter::fromEntity).collect(Collectors.toList());
	}

	@Override
	@Transactional(readOnly = true)
	public QuestionScoreBoundary getScoreByCategoryId(String categoryId, String player) {

		QuestionScoreEntity questionScoreEntity = this.questionScoreDao.findByCategoryIdAndPlayer(categoryId, player);

		if (questionScoreEntity != null)
			return this.questionScoreEntityConverter.fromEntity(questionScoreEntity);
		else
			return new QuestionScoreBoundary();

	}

	@Override
	@Transactional
	public void updateScore(QuestionScoreBoundary newScore) {

		QuestionScoreEntity questionScoreEntity = this.questionScoreDao.findByCategoryIdAndPlayer(newScore.getCategoryId(), newScore.getPlayer());

		if (questionScoreEntity != null) {

			if (Integer.parseInt(questionScoreEntity.getScore()) < Integer.parseInt(newScore.getScore())) {

				questionScoreEntity.setScore(newScore.getScore());
				this.questionScoreDao.save(questionScoreEntity);
			}
		}
		else {
			this.questionScoreDao.save(this.questionScoreEntityConverter.toEntity(newScore));
		}
	}

}

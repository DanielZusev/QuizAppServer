package com.example.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.entity.QuestionScoreEntity;


public interface QuestionScoreDao extends CrudRepository<QuestionScoreEntity, String>{
	
	public List<QuestionScoreEntity> findAllByPlayer(@Param("player") String player);
	
	public QuestionScoreEntity findByCategoryIdAndPlayer(@Param("categoryId") String categoryId, @Param("player") String player);

}

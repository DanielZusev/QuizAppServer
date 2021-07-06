package com.example.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.QuestionEntity;



@Repository
public interface QuestionDao extends MongoRepository<QuestionEntity, String>{
	
	public List<QuestionEntity> findByCategoryId(String categoryId);
	
	public QuestionEntity findByQuestionId(String questionId);

}

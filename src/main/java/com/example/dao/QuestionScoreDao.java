package com.example.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.QuestionScoreEntity;

public interface QuestionScoreDao extends CrudRepository<QuestionScoreEntity, String>{

}

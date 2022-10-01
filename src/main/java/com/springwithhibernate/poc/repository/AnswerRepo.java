package com.springwithhibernate.poc.repository;

import com.springwithhibernate.poc.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepo extends JpaRepository<Answer,String> {
}

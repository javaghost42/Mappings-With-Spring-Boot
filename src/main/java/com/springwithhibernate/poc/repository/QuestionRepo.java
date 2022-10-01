package com.springwithhibernate.poc.repository;

import com.springwithhibernate.poc.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,String> {
}

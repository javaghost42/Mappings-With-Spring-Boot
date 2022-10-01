package com.springwithhibernate.poc.service;

import com.springwithhibernate.poc.entities.Employee;
import com.springwithhibernate.poc.entities.Project;
import com.springwithhibernate.poc.repository.EmployeeRepo;
import com.springwithhibernate.poc.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MainService {

    @Autowired
    private QuestionRepo questionRepo;
    @Autowired
    private EmployeeRepo employeeRepo;

    @PostConstruct
    public void persistData() {

//        Question question = new Question();
//        question.setId("ques-1");
//        question.setQuestion("what is java ?");
//        Answer answer1 = new Answer("ans-1", "Java is a dynamic programming Language.", question);
//        Answer answer2 = new Answer("ans-2", "It is used to create scalable application.", question);
//        question.setAnswers(List.of(answer1, answer2));
//        questionRepo.save(question);

        Employee employee1 = new Employee();
        employee1.setId("emp-1");
        employee1.setName("emp1");
        Employee employee2 = new Employee();
        employee2.setId("emp-2");
        employee2.setName("emp2");

        Project project1 = new Project();
        project1.setId("project-1");
        project1.setName("project1");


        Project project2 = new Project();
        project2.setId("project-2");
        project2.setName("project2");


        employee1.setProjects(List.of(project1, project2));
        employee2.setProjects(List.of(project2));

        employeeRepo.save(employee1);
        employeeRepo.save(employee2);

    }
}
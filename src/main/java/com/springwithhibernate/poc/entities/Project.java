package com.springwithhibernate.poc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Project {

    @Id
    private String id;
    private String name;
    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;
}

package com.springwithhibernate.poc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

    @Id
    private String id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Project> projects;
}

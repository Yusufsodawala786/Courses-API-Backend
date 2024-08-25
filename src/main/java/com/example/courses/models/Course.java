package com.example.courses.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String courseCode;
    private String description;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<CourseInstance> instances;

    // Getters, Setters, Constructors
}
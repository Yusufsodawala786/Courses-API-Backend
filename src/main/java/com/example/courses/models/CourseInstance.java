package com.example.courses.models;

import javax.persistence.*;

@Entity
public class CourseInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;
    private int semester;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    // Getters, Setters, Constructors
}

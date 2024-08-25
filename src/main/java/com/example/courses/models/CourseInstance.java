package com.example.courses.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CourseInstance {
    @Id
    private String id;
    private int year;
    private int semester;
    private String courseId; // Reference to the Course ID

    // Getters, Setters, Constructors
}

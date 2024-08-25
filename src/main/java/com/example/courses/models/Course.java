package com.example.courses.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "courses")
public class Course {
    @Id
    private String id;
    private String title;
    private String courseCode;
    private String description;
    private List<CourseInstance> instances;

    // Getters, Setters, Constructors
}

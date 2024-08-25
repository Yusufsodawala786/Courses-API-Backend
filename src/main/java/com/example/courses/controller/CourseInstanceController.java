package com.example.courses.controller;

import com.example.courses.models.CourseInstance;
import com.example.courses.repository.CourseInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instances")
public class CourseInstanceController {

    @Autowired
    private CourseInstanceRepository courseInstanceRepository;

    @PostMapping
    public CourseInstance createInstance(@RequestBody CourseInstance instance) {
        return courseInstanceRepository.save(instance);
    }

    @GetMapping("/{year}/{semester}")
    public List<CourseInstance> getInstancesByYearAndSemester(@PathVariable int year, @PathVariable int semester) {
        return courseInstanceRepository.findByYearAndSemester(year, semester);
    }

    @DeleteMapping("/{year}/{semester}/{id}")
    public void deleteInstance(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        courseInstanceRepository.deleteById(id);
    }
}


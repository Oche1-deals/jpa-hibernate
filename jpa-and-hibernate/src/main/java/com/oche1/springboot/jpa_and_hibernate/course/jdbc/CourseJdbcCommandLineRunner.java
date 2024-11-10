package com.oche1.springboot.jpa_and_hibernate.course.jdbc;

import com.oche1.springboot.jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS now","in28min"));
        repository.insert(new Course(2,"Learn Azure now","in28min"));
        repository.insert(new Course(3,"Learn Devops now","in28min"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}

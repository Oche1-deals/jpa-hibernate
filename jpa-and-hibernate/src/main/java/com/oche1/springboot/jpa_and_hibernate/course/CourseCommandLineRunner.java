package com.oche1.springboot.jpa_and_hibernate.course;

import com.oche1.springboot.jpa_and_hibernate.course.Course;
import com.oche1.springboot.jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.oche1.springboot.jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.oche1.springboot.jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
  //  @Autowired
    //private CourseJdbcRepository repository;

 //   @Autowired
   // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn AWS jpa","in28min"));
        repository.save(new Course(2,"Learn Azure jpa","in28min"));
        repository.save(new Course(3,"Learn Devops jpa","in28min"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByName("Learn AWS jpa"));
        System.out.println(repository.findByName("Learn Devops jpa"));
    }
}

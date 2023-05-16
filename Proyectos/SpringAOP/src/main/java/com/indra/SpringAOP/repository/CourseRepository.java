package com.indra.SpringAOP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.SpringAOP.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

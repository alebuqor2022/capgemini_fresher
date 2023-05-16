package com.indra.SpringAOP.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.indra.SpringAOP.model.Course;
import com.indra.SpringAOP.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public void saveCourse(Course course) {
		this.courseRepository.save(course);
	}

	@Override
	public Course getCourseById(long id) {
		Optional<Course> optionalCourse = courseRepository.findById(id);
		Course course = null;
		if (optionalCourse.isPresent()) {
			course = optionalCourse.get();
		} else {
			throw new RuntimeException("Course not found for id : " + id);
		}
		return course;
	}

	@Override
	public void deleteCourseById(long id) {
		this.courseRepository.deleteById(id);
	}

	@Override
	public Page<Course> findPaginated(int pageNum, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
				Sort.by(sortField).descending();

		Pageable pageable = PageRequest.of(pageNum - 1, pageSize, sort);
		return this.courseRepository.findAll(pageable);
	}
}

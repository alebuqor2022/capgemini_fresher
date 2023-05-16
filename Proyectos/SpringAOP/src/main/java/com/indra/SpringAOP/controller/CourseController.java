package com.indra.SpringAOP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import com.indra.SpringAOP.model.Course;
import com.indra.SpringAOP.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		return findPaginated(1, "courseName", "asc", model);
	}

	@GetMapping("/add")
	public String showNewCourseForm(Model model) {
		Course Course = new Course();
		model.addAttribute("course", Course);
		return "new_course";
	}

	@PostMapping("/save")
	public String saveCourse(@ModelAttribute("course") Course course) {
		// save Course to database
		courseService.saveCourse(course);
		return "redirect:/";
	}

	@GetMapping("/update/{id}")
	public String showFormForUpdate(@PathVariable( value = "id") long id, Model model) {

		Course course = courseService.getCourseById(id);
		model.addAttribute("course", course);
		return "update_course";
	}

	@GetMapping("/delete/{id}")
	public String deleteCourse(@PathVariable (value = "id") long id) {

		this.courseService.deleteCourseById(id);
		return "redirect:/";
	}


	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo,
								@RequestParam("sortField") String sortField,
								@RequestParam("sortDir") String sortDir,
								Model model) {
		int pageSize = 4;

		Page<Course> page = courseService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Course> listCourses = page.getContent();

		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());

		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model.addAttribute("listCourses", listCourses);
		System.out.println(listCourses.get(pageNo));
		return "index";
	}
}

 
package ca.ludwig.langara.courses.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ca.ludwig.langara.courses.data.output.CourseDataOutput;

@RestController
@RequestMapping("/course")
public class CourseController {

	@ResponseBody
	@GetMapping(value = "", produces = "application/json")
	public CourseDataOutput index() {

		return new CourseDataOutput("CPSC", "1040", "Introduction to Programming", new BigDecimal(3));
	}
}

package ca.ludwig.langara.courses.data.output;

import java.math.BigDecimal;

public class CourseDataOutput {
	private final String department;
	private final String code;
	private final String title;
	private final BigDecimal credits;

	public CourseDataOutput(String department, String code, String title, BigDecimal credits) {
		this.department = department;
		this.code = code;
		this.title = title;
		this.credits = credits;
	}

	public String getCourseTitle() {
		return department + code;
	}

	public String getDepartment() {
		return department;
	}

	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public BigDecimal getCredits() {
		return credits;
	}

}

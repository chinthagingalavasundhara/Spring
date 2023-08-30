package com.tmf.course.SpringBackendProject.beans;

import java.sql.Date;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class Student {
	private long studentId;
	private String studentName;
	private String studentEmail;
	private String studentGender;
	private String studentDOB;
	private long studentMobileNumber;
	private String studentAddress;
	private String studentQualification;

	public Student() {
		System.out.println("WElcome to student object");
	}
}

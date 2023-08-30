package com.tmf.course.SpringBackendProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tmf.course.SpringBackendProject.beans.Customer;
import com.tmf.course.SpringBackendProject.beans.Student;
import com.tmf.course.SpringBackendProject.configs.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		org.springframework.context.ApplicationContext context;
		context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Student s = context.getBean(Student.class);
		System.out.println(s);

	}
}

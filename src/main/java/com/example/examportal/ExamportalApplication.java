package com.example.examportal;


import com.example.examportal.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ExamportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamportalApplication.class, args);
	}

	@Bean
	CommandLineRunner run(StudentService studentService){
		return  args ->{
			studentService.createStudent("2022BTCY003","Ashwin");
			studentService.createStudent("2022BTCY004","Ashwith");

			System.out.println("Students via service");

			studentService.getAllStudents().forEach(student ->
					System.out.println(student.getId() + " " + student.getRollnumber() + " " +
							student.getName()));

		};
	}
}



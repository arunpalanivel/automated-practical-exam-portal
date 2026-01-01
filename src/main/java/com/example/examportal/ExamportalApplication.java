package com.example.examportal;

import com.example.examportal.entity.Student;
import com.example.examportal.repository.StudentRepository;
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
	CommandLineRunner run(StudentRepository studentRepository){
		return args -> {
			Student student1 = new Student("2022BTCY002","AJAY PALANIVEL");
			studentRepository.save(student1);

			System.out.println("Students in Database!");
			studentRepository.findAll().forEach(s->System.out.println(s.getId() + " " + s.getRollnumber()
			+ " " + s.getName()));
		};
	}

}

package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
    return args -> {
      Student juan = new Student("Juan Perez", "jperez@outlook.com", LocalDate.of(1984, Month.JANUARY, 5));
      Student alex = new Student("Alex Gonzalez", "agonzalez@outlook.com", LocalDate.of(1987, Month.JANUARY, 5));

      studentRepository.saveAll(
          List.of(juan, alex));
    };
  }
}

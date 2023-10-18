package com.alberto.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student pepe = new Student(
				"Pepe",
				"pepeluis@prueba.com",
				LocalDate.of(2000, Month.JANUARY, 3),
				23
			);

            Student jose = new Student(
				"Jose",
				"joseluis@prueba.com",
				LocalDate.of(1999, Month.MARCH, 3),
				23
			);

            repository.saveAll(
                List.of(pepe, jose)
            );
        };
    }
    
}

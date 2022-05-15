package com.example.demo.student;

import java.time.*;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student("Mariam", "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));

            Student alex =
                    new Student("Alex", "alex@gmail.com", LocalDate.of(2004, Month.JANUARY, 5));

            studentRepository.saveAll(List.of(mariam, alex));
        };
    }
}

package com.introidx.SpringTutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student prakash = new Student("Prakash", "a@gmaiil.com", LocalDate.of(2000, 12, 23));
            Student rohan = new Student("Rohan", "a@gmaiil.com", LocalDate.of(2000, 12, 23));
            Student rahul = new Student("Rahul", "a@gmaiil.com", LocalDate.of(2000, 12, 23));


            repository.saveAll(
                    List.of(prakash, rohan, rahul)
            );
        };
    }
}

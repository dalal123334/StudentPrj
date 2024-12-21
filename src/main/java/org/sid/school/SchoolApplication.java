package org.sid.school;

import org.sid.school.dto.StudentDto;
import org.sid.school.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
    }
    @Bean
    CommandLineRunner start(StudentService studentService){
        return args -> {
            studentService.saveStudents(
                    List.of(
                            StudentDto.builder().name("Dalal").email("Dalal@gmail.com").build(),
                            StudentDto.builder().name("LuLu").email("Lulu@gmail.com").build(),
                            StudentDto.builder().name("Lina").email("Lina@gmail.com").build(),
                            StudentDto.builder().name("maryem").email("maryem@gmail.com").build()
                    )
            );

        };
    }

}

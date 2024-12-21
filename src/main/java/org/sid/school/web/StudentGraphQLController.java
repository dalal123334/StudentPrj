package org.sid.school.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.sid.school.dto.StudentDto;
import org.sid.school.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
public class StudentGraphQLController {
    private StudentService studentService;
    @MutationMapping
    public StudentDto saveStudent (@Argument StudentDto student) {
        return studentService.saveStudent(student);
    }
    @QueryMapping
    public StudentDto getStudentByDateNaisance(@Argument Date dateNaissance){
        return studentService.getStudentByDateNaissance(dateNaissance);
    }


}

package org.sid.school.mapper;

import org.modelmapper.ModelMapper;
import org.sid.school.dao.entities.Student;
import org.sid.school.dto.StudentDto;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private final ModelMapper mapper=new ModelMapper();
    public Student fromStudentDtoToStudent(StudentDto studentDto){
        return mapper.map(studentDto,Student.class);
    }
    public StudentDto fromStudentToStudentDto(Student student){
        return mapper.map(student,StudentDto.class);
    }
    }

package org.sid.school.service;

import org.sid.school.dto.StudentDto;
import java.util.Date;
import java.util.List;

public interface StudentService {
    public StudentDto getStudentByDateNaissance(Date dateNaissance);
    public StudentDto saveStudent(StudentDto studentDto);
    public List<StudentDto> saveStudents(List<StudentDto> studentDtos);  // Corrected method name
}

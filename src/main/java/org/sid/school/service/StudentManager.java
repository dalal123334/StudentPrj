package org.sid.school.service;

import lombok.AllArgsConstructor;
import org.sid.school.dao.entities.Student;
import org.sid.school.dao.repositories.StudentRepository;
import org.sid.school.dto.StudentDto;
import org.sid.school.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService{
    private StudentRepository studentRepository;
    private StudentMapper studentMapper;
    @Override
    public StudentDto saveStudent (StudentDto studentDto){
        Student student =studentMapper.fromStudentDtoToStudent(studentDto);
        student = studentRepository.save(student);
        studentDto =studentMapper.fromStudentToStudentDto(student);
        return studentDto;

    }

    @Override
    public List<StudentDto> saveStudents(List<StudentDto> studentDtos) {
        return studentDtos;
    }
    @Override
    public StudentDto getStudentByDateNaissance(Date dateNaissance) {
        StudentDto students = studentRepository.findbydateNaissance(dateNaissance);
        return studentMapper.fromStudentToStudentDto(students);
    }



}





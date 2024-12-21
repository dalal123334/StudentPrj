package org.sid.school.dao.repositories;

import org.sid.school.dao.entities.Student;
import org.sid.school.dto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface StudentRepository extends JpaRepository <Student,Long> {
    public StudentDto findbydateNaissance (Date dateNaissance);
}

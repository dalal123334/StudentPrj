package org.sid.school.dto;

import lombok.*;

import java.util.Date;
@Getter
@Setter @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class StudentDto {
    private String name;
    private String email;
    private Date dateNaissance;
}

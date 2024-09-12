package edu.icet.crm.student.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class StudentResponse {
    private long id;
    private String image;
    private String name;
    private String age;
    private String address;
}

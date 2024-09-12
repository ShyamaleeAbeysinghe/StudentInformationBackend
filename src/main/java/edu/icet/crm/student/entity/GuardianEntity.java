package edu.icet.crm.student.entity;

import edu.icet.crm.student.model.Student;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Setter
@Getter
@ToString
@Entity
@Table(name="guardian")
public class GuardianEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String guardianName;
    private String guardianAddress;
    private String guardianContact;

    @OneToMany(mappedBy = "guardian")
    private Set<StudentEntity> studentEntity;
}

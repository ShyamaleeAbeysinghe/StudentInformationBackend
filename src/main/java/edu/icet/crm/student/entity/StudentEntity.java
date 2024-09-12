package edu.icet.crm.student.entity;

import edu.icet.crm.student.model.Guardian;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String age;
    private String contact;
    private String image;

    @ManyToOne
    @JoinColumn(name="guardian_id",nullable = false)
    private GuardianEntity guardian;

}

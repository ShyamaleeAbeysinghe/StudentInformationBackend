package edu.icet.crm.student.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Guardian {
    private String guardianName;
    private String guardianAddress;
    private String guardianContact;
}

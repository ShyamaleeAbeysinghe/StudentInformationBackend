package edu.icet.crm.student.servise;

import edu.icet.crm.student.model.Student;
import edu.icet.crm.student.model.StudentResponse;

import java.util.List;

public interface StudentServise {
    void saveStudent(Student student);
    List<StudentResponse> getAllStudents();
      StudentResponse getStudentById(long id);
}

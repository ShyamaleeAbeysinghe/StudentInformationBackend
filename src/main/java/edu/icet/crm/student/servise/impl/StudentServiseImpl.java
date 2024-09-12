package edu.icet.crm.student.servise.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.student.entity.GuardianEntity;
import edu.icet.crm.student.entity.StudentEntity;
import edu.icet.crm.student.model.Student;
import edu.icet.crm.student.model.StudentResponse;
import edu.icet.crm.student.reporsitary.GuardianReorsitary;
import edu.icet.crm.student.reporsitary.StudentReporsitary;
import edu.icet.crm.student.servise.StudentServise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiseImpl implements StudentServise {

    final StudentReporsitary studentReporsitary;
    final GuardianReorsitary guardianReorsitary;

    final ObjectMapper mapper;

    @Override
    public void saveStudent(Student student) {
        StudentEntity studententity = mapper.convertValue(student, StudentEntity.class);

        GuardianEntity guardian = guardianReorsitary.getByGuardianName(student.getGuardianName());

        studententity.setGuardian(guardian);

        studentReporsitary.save(studententity);
    }

    @Override
    public List<StudentResponse> getAllStudents() {
        Iterable<StudentEntity> iter = studentReporsitary.findAll();
        List<StudentResponse> list = new ArrayList<>();
        for (StudentEntity studentEntity:iter){
            StudentResponse student=new StudentResponse();
            student.setName(studentEntity.getName());
            student.setAge(studentEntity.getAge());
            student.setAddress(studentEntity.getGuardian().getGuardianAddress());
            student.setId(studentEntity.getId());
            student.setImage(studentEntity.getImage());


            list.add(student);
        }
        return list;
    }

    @Override
    public StudentResponse getStudentById(long id) {
        Optional<StudentEntity> student = studentReporsitary.findById(id);
        StudentEntity studentEntity = student.get();

        StudentResponse studentResponse=new StudentResponse();
        studentResponse.setId(studentEntity.getId());
        studentResponse.setImage(studentEntity.getImage());
        studentResponse.setName(studentEntity.getName());
        studentResponse.setAge(studentEntity.getAge());
        studentResponse.setAddress(studentEntity.getGuardian().getGuardianAddress());


        return studentResponse;
    }
}

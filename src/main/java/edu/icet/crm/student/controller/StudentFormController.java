package edu.icet.crm.student.controller;

import edu.icet.crm.student.model.Student;
import edu.icet.crm.student.model.StudentResponse;
import edu.icet.crm.student.servise.StudentServise;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@CrossOrigin

public class StudentFormController {
    final StudentServise servise;

    @PostMapping("/save")
    public Map<String, String> saveProduct(@RequestBody Student student){
        servise.saveStudent(student);
        return Collections.singletonMap("status","student created.");

    }

    @GetMapping("/getAll")
     public List<StudentResponse> getAllStudent(){
        return  servise.getAllStudents();
     }
     @GetMapping("/getStudentById")
     public StudentResponse getStudentById(@RequestParam long id){
        return servise.getStudentById(id);
     }


}

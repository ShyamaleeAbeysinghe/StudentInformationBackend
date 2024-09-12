package edu.icet.crm.student.controller;

import edu.icet.crm.student.model.Guardian;
import edu.icet.crm.student.servise.GuardianServise;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/guardian")
@RequiredArgsConstructor
@CrossOrigin
public class GuardianFormController {

    final GuardianServise guardianServise;

    @PostMapping("/save")
    public Map<String,String> saveGuardian(@RequestBody Guardian guardian){
        System.out.println(guardian);
        guardianServise.saveGuardian(guardian);
        return Collections.singletonMap("status","Guardian created.");
    }
    @GetMapping("/getNames")
    public List<String> getGuardian(){
        return guardianServise.getGuardianNames();
    }
}

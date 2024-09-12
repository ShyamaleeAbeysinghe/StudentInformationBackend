package edu.icet.crm.student.reporsitary;

import edu.icet.crm.student.entity.GuardianEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuardianReorsitary extends CrudRepository<GuardianEntity, Long> {

    @Query(value = "select guardianName from GuardianEntity" )
    List<String> getGuardianNames();
//select * from guardian where guardian_name=""
    GuardianEntity getByGuardianName(String name);

}

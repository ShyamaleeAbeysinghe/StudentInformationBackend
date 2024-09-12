package edu.icet.crm.student.reporsitary;

import edu.icet.crm.student.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentReporsitary extends CrudRepository<StudentEntity, Long> {
}

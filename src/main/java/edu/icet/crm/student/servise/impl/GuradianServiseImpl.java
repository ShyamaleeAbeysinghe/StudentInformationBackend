package edu.icet.crm.student.servise.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.student.entity.GuardianEntity;
import edu.icet.crm.student.model.Guardian;
import edu.icet.crm.student.reporsitary.GuardianReorsitary;
import edu.icet.crm.student.servise.GuardianServise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuradianServiseImpl implements GuardianServise{

    final GuardianReorsitary guardianReorsitary;
    final ObjectMapper mapper;

    @Override
    public void saveGuardian(Guardian guardian) {
        GuardianEntity entity = mapper.convertValue(guardian, GuardianEntity.class);
        guardianReorsitary.save(entity);

    }

    @Override
    public List<String> getGuardianNames() {

        return guardianReorsitary.getGuardianNames();
    }
}

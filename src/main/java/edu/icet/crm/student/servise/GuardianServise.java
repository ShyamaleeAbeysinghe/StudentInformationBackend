package edu.icet.crm.student.servise;

import edu.icet.crm.student.model.Guardian;

import java.util.List;

public interface GuardianServise {
    void saveGuardian(Guardian guardian);
    List<String> getGuardianNames();
}

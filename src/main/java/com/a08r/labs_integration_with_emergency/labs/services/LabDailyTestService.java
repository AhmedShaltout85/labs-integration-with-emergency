package com.a08r.labs_integration_with_emergency.labs.services;

import java.util.List;

public interface LabDailyTestService {
    List<Object[]> getMaxTestValuesLast7Days(String labCode, String testCode);
}
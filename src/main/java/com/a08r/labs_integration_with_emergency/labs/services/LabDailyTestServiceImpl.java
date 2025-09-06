package com.a08r.labs_integration_with_emergency.labs.services;

import com.a08r.labs_integration_with_emergency.labs.repositories.LabDailyTestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabDailyTestServiceImpl implements LabDailyTestService {

    private final LabDailyTestRepository labDailyTestRepository;

    public LabDailyTestServiceImpl(LabDailyTestRepository labDailyTestRepository) {
        this.labDailyTestRepository = labDailyTestRepository;
    }

    @Override
    public List<Object[]> getMaxTestValuesLast7Days(String labCode, String testCode) {
        return labDailyTestRepository.findMaxTestValuesLast7Days(labCode, testCode);
    }
}
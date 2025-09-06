package com.a08r.labs_integration_with_emergency.labs.repositories;

import com.a08r.labs_integration_with_emergency.labs.models.LabDailyTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LabDailyTestRepository extends JpaRepository<LabDailyTest, Long> {

    @Query(value = """
        SELECT MAX(test_value) as max_test_value, test_date, lab_code
        FROM [awco_labs].[dbo].[labs_daily_tests]
        WHERE
        lab_code = :labCode AND
        test_date >= DATEADD(DAY, -7, GETDATE()) AND
        test_is_approved = 1 AND
        test_code = :testCode AND
        test_value IS NOT NULL
        GROUP BY test_date, lab_code
        ORDER BY test_date DESC
        """, nativeQuery = true)
    List<Object[]> findMaxTestValuesLast7Days(
            @Param("labCode") String labCode,
            @Param("testCode") String testCode);

    @Query(value = """
        SELECT TOP 7 MAX(test_value) as max_test_value, test_date, lab_code
        FROM [awco_labs].[dbo].[labs_daily_tests]
        WHERE
        lab_code = :labCode AND
        test_is_approved = 1 AND
        test_code = :testCode AND
        test_value IS NOT NULL
        GROUP BY test_date, lab_code
        ORDER BY test_date DESC
        """, nativeQuery = true)
    List<Object[]> findTestValuesLastTop7(
            @Param("labCode") String labCode,
            @Param("testCode") String testCode);
}
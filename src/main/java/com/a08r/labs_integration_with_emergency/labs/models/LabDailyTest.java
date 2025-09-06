package com.a08r.labs_integration_with_emergency.labs.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "labs_daily_tests")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LabDailyTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "test_value")
    private Double testValue;

    @Column(name = "test_date")
    private LocalDate testDate;

    @Column(name = "lab_code")
    private String labCode;

    @Column(name = "test_code")
    private String testCode;

    @Column(name = "test_is_approved")
    private Boolean testIsApproved;

//    // Constructors
//    public LabDailyTest() {}
//
//    public LabDailyTest(Double testValue, LocalDate testDate, String labCode) {
//        this.testValue = testValue;
//        this.testDate = testDate;
//        this.labCode = labCode;
//    }
//
//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Double getTestValue() {
//        return testValue;
//    }
//
//    public void setTestValue(Double testValue) {
//        this.testValue = testValue;
//    }
//
//    public LocalDate getTestDate() {
//        return testDate;
//    }
//
//    public void setTestDate(LocalDate testDate) {
//        this.testDate = testDate;
//    }
//
//    public String getLabCode() {
//        return labCode;
//    }
//
//    public void setLabCode(String labCode) {
//        this.labCode = labCode;
//    }
//
//    public String getTestCode() {
//        return testCode;
//    }
//
//    public void setTestCode(String testCode) {
//        this.testCode = testCode;
//    }
//
//    public Boolean getTestIsApproved() {
//        return testIsApproved;
//    }
//
//    public void setTestIsApproved(Boolean testIsApproved) {
//        this.testIsApproved = testIsApproved;
//    }
}
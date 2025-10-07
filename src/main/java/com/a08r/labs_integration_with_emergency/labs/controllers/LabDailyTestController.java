package com.a08r.labs_integration_with_emergency.labs.controllers;

import com.a08r.labs_integration_with_emergency.labs.services.LabDailyTestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/labs-w-emergency")
@CrossOrigin(origins = "*")
public class LabDailyTestController {

    private final LabDailyTestService labDailyTestService;

    public LabDailyTestController(LabDailyTestService labDailyTestService) {
        this.labDailyTestService = labDailyTestService;
    }

    @GetMapping("/test-values")
    public ResponseEntity<?> getMaxTestValuesLast7Days(
            @RequestParam String labCode,
            @RequestParam String testCode) {

        try {
            List<Object[]> results = labDailyTestService.getMaxTestValuesLast7Days(labCode, testCode);

            // Transform the Object[] results into a more readable format
            List<Map<String, Object>> formattedResults = results.stream()
                    .map(result -> {
                        Map<String, Object> map = new HashMap<>();
                        map.put("testValue", result[0]);      // MAX(test_value)
                        map.put("testDate", result[1]);          // test_date
//                        map.put("labCode", result[2]);           // lab_code
                        return map;
                    })
                    .toList();

            return ResponseEntity.ok(formattedResults);

        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(Map.of("error", "Failed to retrieve test data: " + e.getMessage()));
        }
    }

    //get path variables
    //TODO:http://localhost:9999/labs-integration-with-emergency/api/v1/labs-w-emergency/test-values/11/84
    @GetMapping("/test-values/{labCode}/{testCode}")
    public ResponseEntity<?> getTestValuesLast7Days(
            @PathVariable String labCode,
            @PathVariable String testCode) {

        try {
            List<Object[]> results = labDailyTestService.getMaxTestValuesLast7Days(labCode, testCode);

            // Transform the Object[] results into a more readable format
            List<Map<String, Object>> formattedResults = results.stream()
                    .map(result -> {
                        Map<String, Object> map = new HashMap<>();
                        map.put("testValue", result[0]);      // MAX(test_value)
                        map.put("testDate", result[1]);          // test_date
//                        map.put("labCode", result[2]);           // lab_code
                        return map;
                    })
                    .toList();

            return ResponseEntity.ok(formattedResults);

        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(Map.of("error", "Failed to retrieve test data: " + e.getMessage()));
        }
    }

   //get path variables
    //TODO:http://localhost:9999/labs-integration-with-emergency/api/v1/labs-w-emergency/test-values-last/11/84
    @GetMapping("/test-values-last/{labCode}/{testCode}")
    public ResponseEntity<?> getTestValuesLastTop7(
            @PathVariable String labCode,
            @PathVariable String testCode) {

        try {
            List<Object[]> results = labDailyTestService.getTestValuesLastTop7(labCode, testCode);

            // Transform the Object[] results into a more readable format
            List<Map<String, Object>> formattedResults = results.stream()
                    .map(result -> {
                        Map<String, Object> map = new HashMap<>();
                        map.put("testValue", result[0]);      // MAX(test_value)
                        map.put("testDate", result[1]);          // test_date
//                        map.put("labCode", result[2]);           // lab_code
                        return map;
                    })
                    .toList();

            return ResponseEntity.ok(formattedResults);

        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(Map.of("error", "Failed to retrieve test data: " + e.getMessage()));
        }
    }

//    // Alternative endpoint that returns raw data
//    @GetMapping("/max-values/raw")
//    public ResponseEntity<?> getMaxTestValuesLast7DaysRaw(
//            @RequestParam String labCode,
//            @RequestParam String testCode) {
//
//        try {
//            List<Object[]> results = labDailyTestService.getMaxTestValuesLast7Days(labCode, testCode);
//            return ResponseEntity.ok(results);
//
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError()
//                    .body(Map.of("error", "Failed to retrieve test data: " + e.getMessage()));
//        }
//    }
}
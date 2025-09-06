package com.a08r.labs_integration_with_emergency.labs.errors;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@AllArgsConstructor
@Data
public class ErrorResponse {
    private static final String MY_TIME_ZONE="Africa/Cairo";
    private String code;
    private String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss",timezone = MY_TIME_ZONE)
    private Date timestamp;
}

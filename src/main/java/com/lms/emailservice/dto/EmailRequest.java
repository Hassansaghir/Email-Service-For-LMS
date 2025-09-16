package com.lms.emailservice.model;

import lombok.Data;

@Data
public class EmailRequest {
    private String email;
    private String message;
}

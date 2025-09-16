package com.lms.emailservice.Controllers;

import com.lms.emailservice.Models.EmailRequest;
import com.lms.emailservice.Services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailRequest request) {
        emailService.sendEmail(request.getEmail(), request.getMessage());
        return "Email sent successfully to " + request.getEmail();
    }
}

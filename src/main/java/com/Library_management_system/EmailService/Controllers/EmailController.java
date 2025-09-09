package com.Library_management_system.EmailService.Controllers;

import com.Library_management_system.EmailService.Models.EmailRequest;
import com.Library_management_system.EmailService.Services.EmailService;
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

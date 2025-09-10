# Email Notification Microservice

## Overview
The **Email Notification Microservice** is a Spring Boot-based service designed to handle email notifications for the Library Management System (LMS).  
It is responsible for sending emails to users, such as notifications when a book is borrowed, reminders, or other system messages.

This microservice can be used independently or integrated with other applications via REST APIs.

---

## Features
- Send email notifications to borrowers or users
- Configurable SMTP settings
- Logs email-sending activities for tracking and debugging
- REST API endpoints for triggering emails
- Supports HTML and plain-text emails

---

## Technology Stack
- **Backend:** Java, Spring Boot
- **Email Service:** JavaMail / Spring Email
- **Database (optional):** PostgreSQL / H2 (for logging email history)
- **Version Control:** Git & GitHub

---

## Installation & Setup

1. **Clone the repository**
```bash
git clone https://github.com/YourUsername/emailservice.git
cd emailservice
Configure email settings
Edit application.properties or application.yml with your SMTP credentials:

properties
Copy code
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
Build & Run

bash
Copy code
mvn clean install
mvn spring-boot:run
Access the API

POST request to /api/send-email with JSON payload:

json
Copy code
{
  "email" : "user@example.com",
  "message" : "Your bookTitle is borrowed"
}
Project Structure
bash
Copy code
emailservice/
│
├─ src/main/java/com/emailservice
│   ├─ controller/   # REST controllers
│   ├─ service/      # Service classes for sending emails
│   ├─ model/        # Email request models
│   └─ config/       # Email configuration
│
├─ src/main/resources/
│   └─ application.properties
│
└─ pom.xml

package com.springlearning.controller;

import com.springlearning.model.EmailModel;
import com.springlearning.services.MailSenderSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RestController
public class EmailSender {
    @Autowired
    MailSenderSpring mailSenderSpring;

    @RequestMapping("/sendmail/${watchers}/${doctor}")
    @GetMapping
    @PostMapping
    @DeleteMapping
    @PutMapping
    @PatchMapping
    @ResponseBody
    public void sendMessage() {
        EmailModel email = new EmailModel();
        email.setTo("u.mk123my@gmail.com");
        email.setFrom("u.mk123my@gmail.com");
        email.setSubject("Emergency Heart Rate alert !!!");
        email.setContent("Patience ");
        Map<String, Object> model = new HashMap<>();
        model.put("firstName", "krishankant");
        model.put("lastName", "Singhal");
        mailSenderSpring.sendEmailWithTemplate(email);
    }

}

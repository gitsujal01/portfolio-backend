package com.mylibrary.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mylibrary.services.EmailJsService;

@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    private EmailJsService emailJsService;

    @PostMapping("/sendEmail")
    public ResponseEntity<?> sendEmail(@RequestBody Map<String, String> body) {
        try {
            Map<String, Object> templateParams = Map.of(
                "name", body.get("name"),
                "message", body.get("message"),
                "reply_to", body.get("user_email") // user’s email as reply-to
            );

            emailJsService.sendEmail(
                System.getenv("EMAILJS_SERVICE_ID"),
                System.getenv("EMAILJS_TEMPLATE_ID"),
                templateParams,
                System.getenv("EMAILJS_PUBLIC_KEY")
            );

            return ResponseEntity.ok(Map.of("success", true));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
        }
    }
}
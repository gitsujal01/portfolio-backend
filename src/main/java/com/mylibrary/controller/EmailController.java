package com.mylibrary.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // allow your frontend to call it
public class EmailController {

    @Value("${EMAILJS_SERVICE_ID}")
    private String serviceId;

    @Value("${EMAILJS_TEMPLATE_ID}")
    private String templateId;

    @Value("${EMAILJS_PUBLIC_KEY}")
    private String publicKey;

    @PostMapping("/sendEmail")
    public ResponseEntity<?> sendEmail(@RequestBody Map<String, String> body) {
        try {
            // get data from frontend
            String name = body.get("name");
            String mobile = body.get("mobile");
            String message = body.get("message");

            // call EmailJS REST API using your keys (hidden in backend)
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://api.emailjs.com/api/v1.0/email/send";

            Map<String, Object> payload = new HashMap<>();
            payload.put("service_id", serviceId);
            payload.put("template_id", templateId);
            payload.put("user_id", publicKey);

            Map<String, String> templateParams = new HashMap<>();
            templateParams.put("name", name);
            templateParams.put("mobile", mobile);
            templateParams.put("message", message);

            payload.put("template_params", templateParams);

            restTemplate.postForEntity(url, payload, String.class);

            return ResponseEntity.ok(Map.of("success", true));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
        }
    }
}
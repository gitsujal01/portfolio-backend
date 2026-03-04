package com.mylibrary.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.util.Map;

@Service
public class EmailJsService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String EMAILJS_URL = "https://api.emailjs.com/api/v1.0/email/send";

    public void sendEmail(String serviceId, String templateId, Map<String, Object> templateParams, String publicKey) {
        // Prepare payload
        Map<String, Object> payload = Map.of(
            "service_id", serviceId,
            "template_id", templateId,
            "user_id", publicKey,
            "template_params", templateParams
        );

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(payload, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(EMAILJS_URL, request, String.class);

        if (!response.getStatusCode().is2xxSuccessful()) {
            throw new RuntimeException("EmailJS failed: " + response.getBody());
        }
    }
}
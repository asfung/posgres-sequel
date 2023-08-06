package com.paung.service.components;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpRequestScheduler {
    private final RestTemplate restTemplate = new RestTemplate();

    @Scheduled(fixedDelay = 5000)
    public void makeHttpRequest(){
        String url = "http://localhost:8080/person";

        restTemplate.getForObject(url,String.class);
        System.out.println("Http Request Sent............");

    }
}

package com.demorest.demorest.controller;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
@RequestMapping(value = "/veg")
public class vegcontroller {

    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String getveginfo(){

        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> httpEntity=new HttpEntity<>(httpHeaders);
        ResponseEntity<?> response= restTemplate.exchange("http://localhost:8080/user1", HttpMethod.GET, httpEntity, String.class);
        return response.getBody().toString();
    }


}


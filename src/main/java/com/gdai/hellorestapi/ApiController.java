package com.gdai.hellorestapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController("/api")
public class ApiController {

    @GetMapping
    public ResponseEntity<Response> sayHello () {
        Response response = new Response("Hello best api. ");
        return ResponseEntity.ok(response);
    }
}

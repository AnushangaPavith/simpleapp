package com.example.simpleapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/point")
@RequiredArgsConstructor
public class pointController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createPoint(@RequestBody String str) {
        System.out.println(str);

        return str + " created";
    }
}

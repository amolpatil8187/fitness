package com.health.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amolpatil on 1/31/16.
 */
@RestController
@RequestMapping("/")
public class PersonalRecordController {

    @RequestMapping("/amanda")
    public String get(){
        return "Mon Amour!";
    }
}

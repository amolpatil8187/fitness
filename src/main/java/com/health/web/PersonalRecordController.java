package com.health.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

/**
 * Created by amolpatil on 1/31/16.
 */
@RestController
@RequestMapping("/personal-records")
public class PersonalRecordController {

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public String get(@PathVariable String id){
        return id;
    }
}

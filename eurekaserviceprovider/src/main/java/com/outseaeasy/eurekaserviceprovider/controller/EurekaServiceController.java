package com.outseaeasy.eurekaserviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaServiceController {

    @RequestMapping(value="hello", method = RequestMethod.GET)
    public String Hello(@RequestParam String name){

        return "Hello," + name;
    }
}

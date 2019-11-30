package com.outseaeasy.feignserviceconsumer.controller;

import com.outseaeasy.feignserviceconsumer.api.FeignServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignServiceController {

    @Autowired
    private FeignServiceInterface feignServiceInterface;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String Hello(@RequestParam String name){

        return feignServiceInterface.hello(name);
    }
}

package com.outseaeasy.feignserviceconsumer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eurekaserviceprovider")
public interface FeignServiceInterface {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    String hello(@RequestParam String name);
}

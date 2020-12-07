package com.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {
    @Value("${greeting:Hi}")
    private String greeting;
   
    @GetMapping("/greeting/{message}")
    public String echo(@PathVariable String message) {
        return greeting + " => " + message;
    } 
}

package com.dp.market.demo.market.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayHello")
public class HolaMundoController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello it works!";
    }
}

package com.raisetech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/japan")
    public String ohayou(){
        return "おはよう";
    }

    @GetMapping("/gogo")
    public String konnnitiwa(){
        return "こんにちは";
    }

    @GetMapping("/yoru")
    public String oyasumi(){
        return "おやすみ";
    }
}

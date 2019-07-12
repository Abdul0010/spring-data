package com.abdul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author by AbdulQader
 * on 12/7/2019.
 */
@RestController
public class HomeController {
    @GetMapping(value = "/")
    public String home(){
        return "home";
    }
    @GetMapping(value = "/private")
    public String privateArea(){
        return "private area";
    }

}

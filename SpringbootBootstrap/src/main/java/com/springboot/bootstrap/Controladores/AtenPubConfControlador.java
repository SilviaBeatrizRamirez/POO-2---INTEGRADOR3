package com.springboot.bootstrap.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AtenPubConfControlador {

    @RequestMapping("/configAtenPub")
    public String loginSubmit(){
        return "/pages/configAtenPub";}
}

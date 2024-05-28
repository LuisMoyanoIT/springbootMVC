package com.luis.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.luis.curso.springboot.webapp.springbootweb.models.User;



//indica que es un controlador de spring
//componente son elementos que se guardan en un contenedor
@Controller
public class UserController {

    
    @GetMapping("/details")
    public String details(Model model )
    {   
        User user = new User("Luis","Moyano");
        model.addAttribute( "title",  "Hola Mundo soy");
        model.addAttribute( "user",  user);
        return "details";
    }

}

package com.luis.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springbootweb.models.User;
import com.luis.curso.springboot.webapp.springbootweb.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api/pathVariable")
public class PathVariableController {

    @Value("${config.username}")
    private String userName;

    @Value("${config.message}")
    private String message;

    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @Value("${config.code}")
    private Integer code;


    @GetMapping("/oneParam/{message}")
    public ParamDTO returnJson( @PathVariable() String message ) {

        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage( message != null ? message: "hola");
        return paramDTO;
    }

    @GetMapping("/multipleParam/{message}/{code}")
    public ParamDTO multipleParam( @PathVariable() String message, @PathVariable() Integer code ) {

        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage( message != null ? message: "hola");
        paramDTO.setCode(code);
        return paramDTO;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        //TODO: process POST request
        user.setName( user.getName().toUpperCase() );
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values() {

        Map<String, Object> json = new HashMap<>();
        json.put("username", userName);
        json.put("message", message);
        json.put("code", code);
        json.put("listOfValues", listOfValues);


        return json;
    }
    
    

}

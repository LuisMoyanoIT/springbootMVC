package com.luis.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springbootweb.models.dto.ParamDTO;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/params")
public class RequestParamController {


    @GetMapping("/returnJson")
    public ParamDTO returnJson(@RequestParam(required = false, defaultValue="defaultMessage") String message) {

        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage( message != null ? message: "hola");
        return paramDTO;
    }

    @GetMapping("/multipleParam")
    public ParamDTO multipleParam(
        @RequestParam(required = false, defaultValue="defaultMessage") String text,
        @RequestParam(required = false, defaultValue="1") Integer code
        ) {

        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage( text );
        paramDTO.setCode(code);
        return paramDTO;
    }

    @GetMapping("/request")
    public ParamDTO request(HttpServletRequest request  ) {
        Integer code = 0;
        try {
            code  = Integer.parseInt( request.getParameter("code") );
        } catch (NumberFormatException e) {
            
        }
        
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage( request.getParameter("text") );
        paramDTO.setCode( code );
        return paramDTO;
    }
    

}

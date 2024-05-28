package com.luis.curso.springboot.webapp.springbootweb.controllers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springbootweb.models.User;
import com.luis.curso.springboot.webapp.springbootweb.models.dto.UserDTO;



//indica que es un controlador de spring
//componente son elementos que se guardan en un contenedor
@RestController
@RequestMapping("/api")
public class UserRestController {

    
    @GetMapping("/details1")
    public UserDTO details()
    {   
        User user = new User("Luis","Moyano DTO");
        UserDTO userDto = new UserDTO();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo soy dto");
 
        return userDto;
    }

    @GetMapping("/details-map")
    public Map<String, Object> details2()
    {   
        User user = new User("Luis","Moyano");
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Hola mundo soy");
        response.put("user", user);
        return response;
    }

    @GetMapping("/details-list")
    public List<User> detailsList()
    {   
        User user = new User("Luis","Moyano DTO");
        User user1 = new User("Luis1","Moyano DTO 1");
        User user2 = new User("Luis2","Moyano DTO 2");

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user1);
        // users.add(user2);

        List<User> users = Arrays.asList(user, user1, user2);



        return users;
        
    }

}

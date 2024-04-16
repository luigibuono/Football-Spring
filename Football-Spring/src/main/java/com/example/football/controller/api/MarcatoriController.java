package com.example.football.controller.api;


import com.example.football.model.Marcatori;
import com.example.football.service.IMarcatoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@RestController
public class MarcatoriController {


   @Autowired
   private IMarcatoriService marcatoriService;

   public MarcatoriController(){}

    @RequestMapping("/api/marcatori")
    public Iterable<Marcatori> getAll(){
       return marcatoriService.getAll();
    }
    @RequestMapping("/api/marcatori/{id}")
    public Marcatori getById(@PathVariable int id) {
    Optional<Marcatori> marcatori = marcatoriService.getById(id);

    if (marcatori.isEmpty()){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
    }
    return marcatori.get();
    }
}

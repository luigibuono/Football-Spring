package com.example.football.controller.api;

import com.example.football.model.Assist;
import com.example.football.model.Marcatori;
import com.example.football.service.IAssistService;
import com.example.football.service.IMarcatoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class AssistController {


    @Autowired
    private IAssistService assistService;

    public AssistController(){}

    @RequestMapping("/api/assist")
    public Iterable<Assist> getAll(){
        return assistService.getAll();
    }
    @RequestMapping("/api/assist/{id}")
    public Assist getById(@PathVariable int id) {
        Optional<Assist> assist = assistService.getById(id);

        if (assist.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
        }
        return assist.get();
    }
}

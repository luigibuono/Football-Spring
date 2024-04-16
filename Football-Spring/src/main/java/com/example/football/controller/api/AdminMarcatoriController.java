package com.example.football.controller.api;


import com.example.football.model.Marcatori;
import com.example.football.service.IMarcatoriService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@RestController
public class AdminMarcatoriController {


    @Autowired
    private IMarcatoriService marcatoriService;

    public AdminMarcatoriController(){}

    @RequestMapping("/admin/api/marcatori")
    public Iterable<Marcatori> getAll() {

        return marcatoriService.getAll();
    }

    @RequestMapping("/admin/api/marcatori/{id}")
    public Marcatori getById(@PathVariable int id) {

        Optional<Marcatori> marcatori = marcatoriService.getById(id);

        if (marcatori.isEmpty()) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
        }

        return marcatori.get();
    }

    @RequestMapping(value = "/admin/api/marcatori", method = RequestMethod.POST)
    public Marcatori create(@Valid @RequestBody Marcatori marcatori) {

        return marcatoriService.create(marcatori);
    }

    @RequestMapping(value = "/admin/api/marcatori/{id}", method = RequestMethod.PUT)
    public Marcatori update(@PathVariable int id, @Valid @RequestBody Marcatori marcatori) {

        Optional<Marcatori> updatedMarcatori = marcatoriService.update(id, marcatori);

        if (updatedMarcatori.isEmpty()) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
        }

        return updatedMarcatori.get();
    }

    @RequestMapping(value = "/admin/api/marcatori/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {

        Boolean isDeleted = marcatoriService.delete(id);

        if (isDeleted == false) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
        }
    }
}

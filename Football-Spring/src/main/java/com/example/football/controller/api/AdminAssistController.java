package com.example.football.controller.api;

import com.example.football.model.Assist;
import com.example.football.service.IAssistService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;



    @RestController
    public class AdminAssistController {


        @Autowired
        private IAssistService assistService;

        public AdminAssistController(){}

        @RequestMapping("/admin/api/assist")
        public Iterable<Assist> getAll() {

            return assistService.getAll();
        }

        @RequestMapping("/admin/api/assist/{id}")
        public Assist getById(@PathVariable int id) {

            Optional<Assist> assist = assistService.getById(id);

            if (assist.isEmpty()) {

                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
            }

            return assist.get();
        }

        @RequestMapping(value = "/admin/api/assist", method = RequestMethod.POST)
        public Assist create(@Valid @RequestBody Assist assist) {

            return assistService.create(assist);
        }

        @RequestMapping(value = "/admin/api/assist/{id}", method = RequestMethod.PUT)
        public Assist update(@PathVariable int id, @Valid @RequestBody Assist assist) {

            Optional<Assist> updatedAssist = assistService.update(id, assist);

            if (updatedAssist.isEmpty()) {

                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
            }

            return updatedAssist.get();
        }

        @RequestMapping(value = "/admin/api/assist/{id}", method = RequestMethod.DELETE)
        public void delete(@PathVariable int id) {

            Boolean isDeleted = assistService.delete(id);

            if (isDeleted == false) {

                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
            }
        }
    }


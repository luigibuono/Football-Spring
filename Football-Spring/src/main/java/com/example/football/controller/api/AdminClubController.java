package com.example.football.controller.api;


import com.example.football.model.Club;
import com.example.football.service.IClubService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@RestController
public class AdminClubController {

    @Autowired
   private IClubService clubService;

    private int lastId;

    public AdminClubController() {
    }

    @RequestMapping("/admin/api/club")
    public Iterable<Club> getAll() {
        return clubService.getAll();
    }

    @RequestMapping("/admin/api/club/{id}")
    public Club getById(@PathVariable int id) {

        Optional<Club> club = clubService.getById(id);

        if (club.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
        }
        return club.get();
    }


    @RequestMapping(value = "/admin/api/club", method = RequestMethod.POST)
    public Club create(@Valid @RequestBody Club club) {

return clubService.create(club);

    }

    @RequestMapping(value = "/admin/api/club/{id}", method = RequestMethod.PUT)
    public Club update(@PathVariable int id,@Valid @RequestBody Club club) {

        Optional<Club> updateClub =  clubService.update(id,club);

        if (updateClub.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
        }
        updateClub.get().setUrl(club.getUrl());

        return updateClub.get();

    }


    @RequestMapping(value = "/admin/api/club/{id}", method = RequestMethod.DELETE)
    public void Delete(@PathVariable int id) {

       Boolean isDeleted = clubService.Delete(id);

        if (isDeleted == false) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
        }


    }

}




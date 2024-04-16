package com.example.football.controller.api;


import com.example.football.model.Club;
import com.example.football.service.IClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@RestController
public class ClubController {


 @Autowired
 private IClubService clubService;

 public ClubController() {


 }

  @RequestMapping("/api/club")
  public Iterable<Club> getAll() {
   return clubService.getAll();
  }

  @RequestMapping("/api/club/{id}")
  public Club getById ( @PathVariable int id){

   Optional<Club> club = clubService.getById(id);

   if (club.isEmpty()) {
    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
   }
   return club.get();
  }
 }

package com.example.football.service;


import com.example.football.model.Club;

import java.util.Optional;

public interface IClubService {

    public Iterable<Club> getAll();

    public Optional<Club> getById(int id);

    public Club create(Club club);

    public Optional<Club> update(int id, Club club);

    public Boolean Delete(int id);

}





package com.example.football.service;

import com.example.football.model.Marcatori;

import java.util.Optional;

public interface IMarcatoriService {


    public Iterable<Marcatori> getAll();

    public Optional<Marcatori> getById(int id);

    public Marcatori create(Marcatori marcatori);

    public Optional<Marcatori> update (int id, Marcatori marcatori);

    public Boolean delete(int id);
}

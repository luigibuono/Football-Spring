package com.example.football.service;


import com.example.football.model.Assist;

import java.util.Optional;

public interface IAssistService {

public Iterable<Assist> getAll();

public Optional<Assist> getById(int id);

public Assist create(Assist assist);

public Optional<Assist> update (int id, Assist assist);

public Boolean delete(int id);
        }

package com.example.football.repository;

import com.example.football.model.Marcatori;
import org.springframework.data.repository.CrudRepository;

public interface IMarcatoriRepository extends CrudRepository <Marcatori, Integer> {
}

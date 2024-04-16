package com.example.football.repository;

import com.example.football.model.Assist;
import com.example.football.model.Club;
import org.springframework.data.repository.CrudRepository;

public interface IAssistRepository extends CrudRepository<Assist, Integer> {
}

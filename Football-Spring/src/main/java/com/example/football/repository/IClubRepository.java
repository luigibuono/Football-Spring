package com.example.football.repository;


import com.example.football.model.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IClubRepository extends CrudRepository<Club, Integer> {




}

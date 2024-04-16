package com.example.football.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Marcatori {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private int goals;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public int getGoals(){
        return goals;
    }
    public void setGoals(int goals){
        this.goals=goals;
    }



    public Marcatori(){}

    public Marcatori(int id,String name,String surname,int goals){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.goals=goals;
    }
}

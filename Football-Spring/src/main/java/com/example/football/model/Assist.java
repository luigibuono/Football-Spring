package com.example.football.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assist {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String surname;
    private int assist;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public int getAssist(){
        return assist;
    }
    public void setAssist(int assist){
        this.assist=assist;
    }

    public Assist(){}

    public Assist(int id,String name,String surname,int assist){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.assist=assist;
    }
}


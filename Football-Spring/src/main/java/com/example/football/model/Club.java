package com.example.football.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int id;

    @NotBlank(message = "This field is required")
    @Length(min = 2, message ="Min length is 2")
    private String url;

    public int getId(){ return id;}

    public void setId(int id){ this.id = id;}

    public String getUrl(){ return url;}

    public void setUrl(String url){ this.url = url;}


    public Club(){}

public Club(int id, String url){
    this.id=id;
    this.url=url;
}
}
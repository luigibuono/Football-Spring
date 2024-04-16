package com.example.football.service;


import com.example.football.model.Marcatori;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MarcatoriService implements IMarcatoriService {

    private List<Marcatori> list;

    private int lastId;


    public MarcatoriService(){

        list = new ArrayList<Marcatori>();

        list.add(new Marcatori(1,"","",2));
        list.add(new Marcatori(2,"","",3));
        list.add(new Marcatori(3,"","",4));
        list.add(new Marcatori(4,"","",5));
        list.add(new Marcatori(5,"","",6));
        list.add(new Marcatori(6,"","",7));
    }

    @Override
    public Iterable<Marcatori> getAll(){
        return list;
    }
    @Override
    public Optional<Marcatori> getById(int id){
        Optional<Marcatori> marcatori = list.stream().filter(item->item.getId() == id).findFirst();

        return marcatori;
    }
    @Override
    public Marcatori create(Marcatori marcatori){

        lastId++;

        marcatori.setId(lastId);

        list.add(marcatori);

        return marcatori;
    }
    @Override
    public Optional <Marcatori> update (int id,Marcatori marcatori){
        Optional<Marcatori> FoundMarcatori = list.stream().filter(item->item.getId() == id).findFirst();

        if(FoundMarcatori.isEmpty()) {
            return Optional.empty();
        }
        FoundMarcatori.get().setGoals(marcatori.getGoals());

        return FoundMarcatori;
    }
    @Override
    public Boolean delete(int id){
        Optional<Marcatori> FoundMarcatori = list.stream().filter(item->item.getId() == id).findFirst();

        if(FoundMarcatori.isEmpty()){
            return false;
        }
        list.remove(FoundMarcatori.get());
        return true;
    }
}

package com.example.football.service;

import com.example.football.model.Assist;
import com.example.football.model.Marcatori;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


    @Service
    public class AssistService implements IAssistService {

        private List<Assist> list;

        private int lastId;


        public AssistService(){

            list = new ArrayList<Assist>();

            list.add(new Assist(1,"","",2));
            list.add(new Assist(2,"","",3));
            list.add(new Assist(3,"","",4));
            list.add(new Assist(4,"","",5));
            list.add(new Assist(5,"","",6));
            list.add(new Assist(6,"","",7));
        }

        @Override
        public Iterable<Assist> getAll(){
            return list;
        }
        @Override
        public Optional<Assist> getById(int id){
            Optional<Assist> assist= list.stream().filter(item->item.getId() == id).findFirst();

            return assist;
        }
        @Override
        public Assist create(Assist assist){

            lastId++;

            assist.setId(lastId);

            list.add(assist);

            return assist;
        }
        @Override
        public Optional <Assist> update (int id,Assist assist){
            Optional<Assist> FoundAssist = list.stream().filter(item->item.getId() == id).findFirst();

            if(FoundAssist.isEmpty()) {
                return Optional.empty();
            }
            FoundAssist.get().setAssist(assist.getAssist());

            return FoundAssist;
        }
        @Override
        public Boolean delete(int id){
            Optional<Assist> FoundAssist = list.stream().filter(item->item.getId() == id).findFirst();

            if(FoundAssist.isEmpty()){
                return false;
            }
            list.remove(FoundAssist.get());
            return true;
        }
    }



package com.example.football.service;



import com.example.football.model.Club;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClubService implements IClubService {

    private List<Club> list;
    private int lastId;

    public ClubService() {
        list = new ArrayList<Club>();

        list.add(new Club(6, "./img/fiorentina.avif"));
        list.add(new Club(5, "./img/Atalanta.jpg"));
        list.add(new Club(4, "./img/640x0_1462089775187_151978918.jpg"));
        list.add(new Club(3, "./img/Brand_img.jpg"));
        list.add(new Club(2, "/img/unnamed.png"));
        list.add(new Club(1, "/img/417p6-ByfJL._UF1000,1000_QL80_.jpg"));

        lastId=20;
    }

    @Override
    public Iterable<Club> getAll() {

        return list;
    }
@Override

    public  Optional <Club> getById(int id) {

        Optional<Club> club = list.stream().filter(item -> item.getId() == id).findFirst();

        return club;
    }

    @Override

    public Club create(Club club) {


        lastId++;
        club.setId(lastId);

        list.add(club);
        return club;
    }

@Override
    public Optional <Club> update( int id, Club club) {

        Optional<Club> FoundClub = list.stream().filter(item -> item.getId() == id).findFirst();

        if (FoundClub.isEmpty()) {
           return Optional.empty();
        }
        FoundClub.get().setUrl(club.getUrl());

        return FoundClub;

    }

@Override
public Boolean Delete(int id){

        Optional<Club> FoundClub = list.stream().filter(item -> item.getId() == id).findFirst();

        if (FoundClub.isEmpty()) {
         return false;
        }
        list.remove(FoundClub.get());
        return true;
    }



    }


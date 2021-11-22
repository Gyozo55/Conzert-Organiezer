package com.company;

import com.company.concert.Concert;
import com.company.concert.Outdoor;

import java.util.ArrayList;
import java.util.List;

public class Organiser {
    private boolean isRaining;
    private List<Concert> concerts = new ArrayList<>();

    public void addConcert(Concert concert){
        concerts.add(concert);
    }

    public List<Concert> getConcerts() {
        return concerts;
    }

    public void cancelConcert(Concert concert) throws Exception {
        if(isRaining || concert instanceof Outdoor){
          concerts.remove(concert);
        }
        else {
            throw new Exception("..");
        }
    }

    public double calculateProfit(){
        double totalProfit=0;
        for(Concert concert: concerts){
            totalProfit+=concert.getProfit();
        }
        return totalProfit;
    }

}

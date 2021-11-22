package com.company.concert;

import com.company.band.Band;
import com.company.band.Style;

public abstract class Concert {
    private Band mainBand;
    private Band warmUpBand;
    private int capacity;
    private int lengthInMinute;
    private double beerPrice;
    private int beerSold;
    private final double tickerPrice;
    private int ticketSold;

    public Concert (Band mainBand, Band warmUpBand, int capacity, int lengthInMinute, double beerPrice,
                   int beerSold, double tickerPrice, int ticketSold) throws Exception {
        if(tickerPrice<=12000.0 || tickerPrice>=15000.0){
            throw new Exception("Please try correct g.");
        }
        if(warmUpBand.isMainBandType() || !mainBand.isMainBandType() ||
                mainBand.getBandStyle()!=warmUpBand.getBandStyle()){
            throw new Exception("Please try correct arg.");
        }
        this.mainBand = mainBand;
        this.warmUpBand = warmUpBand;
        this.capacity = capacity;
        this.lengthInMinute = lengthInMinute;
        this.beerPrice = beerPrice;
        this.beerSold = beerSold;
        this.tickerPrice = tickerPrice;
        this.ticketSold = ticketSold;
    }

    public void sellTickets() throws Exception {
        if(ticketSold>=capacity){
            throw new Exception("No more free spot in Concert!");
        }
        ticketSold+=1;

    }

    public void sellBeer(){
        beerSold+=1;
    }

    public double getProfit(){
        return (beerSold*beerSold) + (ticketSold*tickerPrice)*0.4;
    }


}

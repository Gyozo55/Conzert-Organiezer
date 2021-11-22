package com.company.concert;

import com.company.band.Band;

public class Outdoor extends Concert{
    private static final int CAPACITY = 5000;
    private static final int LENGTHINMINUTE = 120;
    private static final int BERRPRICE = 800;
    private static final int BEERSOLD = 0;
    private static final int TICKETSOLD = 0;

    public Outdoor(Band mainBand, Band warmUpBand, double tickerPrice) throws Exception {
        super(mainBand, warmUpBand, CAPACITY, LENGTHINMINUTE, BERRPRICE, BEERSOLD, tickerPrice, TICKETSOLD);
    }
}

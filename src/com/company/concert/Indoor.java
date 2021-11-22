package com.company.concert;

import com.company.band.Band;

public class Indoor extends Concert{
    private static final int CAPACITY = 3000;
    private static final int LENGTHINMINUTE = 90;
    private static final int BERRPRICE = 600;
    private static final int BEERSOLD = 0;
    private static final int TICKETSOLD = 0;

    public Indoor(Band mainBand, Band warmUpBand, double tickerPrice) throws Exception {
        super(mainBand, warmUpBand, CAPACITY, LENGTHINMINUTE, BERRPRICE, BEERSOLD, tickerPrice, TICKETSOLD);
    }
}

package com.company.concert;

import com.company.band.Band;

public class Festival extends Concert{

    private static final int CAPACITY = 8000;
    private static final int LENGTHINMINUTE = 360;
    private static final int BERRPRICE = 1000;
    private static final int BEERSOLD = 0;
    private static final int TICKETSOLD = 0;

    public Festival(Band mainBand, Band warmUpBand, double tickerPrice) throws Exception {
        super(mainBand, warmUpBand, CAPACITY, LENGTHINMINUTE, BERRPRICE, BEERSOLD, tickerPrice, TICKETSOLD);
    }
}

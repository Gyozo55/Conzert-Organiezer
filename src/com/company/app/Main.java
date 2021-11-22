package com.company.app;

import com.company.Organiser;
import com.company.band.Band;
import com.company.band.Style;
import com.company.concert.Concert;
import com.company.concert.Festival;

public class Main {

    public static void main(String[] args) throws Exception {
        Organiser organiser= new Organiser();
        Band rockBand01 = new Band(Style.ROCK, true, "AC/DC");
        Band rockBand02 = new Band(Style.ROCK, false, "Tankcsapda");
        Festival rockmaraton = new Festival(rockBand01, rockBand02, 13500);
        organiser.addConcert(rockmaraton);
        rockmaraton.sellBeer();
        rockmaraton.sellBeer();
        rockmaraton.sellBeer();
        rockmaraton.sellBeer();
        rockmaraton.sellTickets();
        rockmaraton.sellTickets();
        rockmaraton.sellTickets();
        rockmaraton.sellTickets();
        rockmaraton.sellTickets();
        rockmaraton.sellTickets();
        System.out.println(organiser.calculateProfit()+" dollár");
    }
}

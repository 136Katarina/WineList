package com.example.codeclan.topwinelist;

import java.util.ArrayList;

/**
 * Created by katarinazemplenyiova on 19/12/2017.
 */

public class TopWines {

    private ArrayList<Wine> list;

    public TopWines(){
        list = new ArrayList<Wine>();
        list.add(new Wine(1,"Duckhorn",2014));
        list.add(new Wine(2,"K",2014));
        list.add(new Wine(3,"Chateu Coutet",2014));
        list.add(new Wine(4,"Casanova di neri",2012));
        list.add(new Wine(5,"Cateu de St.-Cosme",2015));
        list.add(new Wine(6,"Domaine Huet",2016));
        list.add(new Wine(7,"Meyer",2014));
        list.add(new Wine(8,"Pahlmeyer",2015));
        list.add(new Wine(9,"Booker",2014));
        list.add(new Wine(10,"Altesino",2012));
        list.add(new Wine(11,"Bedrock",2015));
        list.add(new Wine(12,"Sixto",2014));
        list.add(new Wine(13,"Clos des Papes",2015));
    }
    public ArrayList<Wine> getList(){return new ArrayList<Wine>(list);}
}

package com.example.codeclan.topwinelist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by katarinazemplenyiova on 19/12/2017.
 */

public class WineTest {
    Wine wine;

    @Before
    public void before(){
        wine = new Wine(1,"Duckhorn",2014);
    }

    @Test
    public void canGetRank(){
        assertEquals((Integer)1,wine.getRank());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Duckhorn",wine.getTitle());
    }

    @Test
    public void canGetVintage(){
        assertEquals((Integer)2014,wine.getVintage());
    }





}

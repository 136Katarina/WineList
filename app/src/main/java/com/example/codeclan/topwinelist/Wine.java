package com.example.codeclan.topwinelist;


import java.io.Serializable;

/**
 * Created by katarinazemplenyiova on 19/12/2017.
 */

public class Wine implements Serializable {

    private Integer rank;
    private String title;
    private Integer vintage;


    public Wine(Integer rank, String title, Integer vintage) {
        this.rank = rank;
        this.title = title;
        this.vintage = vintage;
    }

    public Integer getRank() {
        return rank;
    }

    public Integer getVintage() {
        return vintage;
    }


    public String getTitle() {
        return title;
    }
}

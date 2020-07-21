package com.sumeyyeakay.utils;

public class Search {
    private String wanted;
    private String tour;

    public Search(String wanted, String tour) {
        this.wanted = wanted;
        this.tour = tour;
    }

    public String getWanted() {
        return wanted;
    }

    public void setWanted(String wanted) {
        this.wanted = wanted;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }
}

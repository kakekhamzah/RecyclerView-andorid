package com.example.recycleview;

public class Movie {
    private String Tittle;
    private String Year;

    public Movie(String tittle, String year) {
        Tittle = tittle;
        Year = year;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

}

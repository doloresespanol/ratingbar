package com.example.rating;

public class Gwiazdki {
    public String nazwa;
    public int path;
    public float ileGwiazdek;

    public Gwiazdki(String nazwa, int path, int ileGwiazdek) {
        this.nazwa = nazwa;
        this.path = path;
        this.ileGwiazdek = ileGwiazdek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public float getIleGwiazdek() {
        return ileGwiazdek;
    }

    public void setIleGwiazdek(int ileGwiazdek) {
        this.ileGwiazdek = ileGwiazdek;
    }
}

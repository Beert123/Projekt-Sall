package application.model;

import java.util.ArrayList;

public class Destillat {
    private double alkoholProcent;
    private Mængde mængde;
    private ArrayList<Destillering> destilleringer = new ArrayList<>();

    public Destillat(double alkoholProcent, Mængde mængde) {
        this.alkoholProcent = alkoholProcent;
        this.mængde = mængde;
    }

    public double getAlkoholProcent() {
        return alkoholProcent;
    }

    public Mængde getMængde() {
        return mængde;
    }

    public ArrayList<Destillering> getDestilleringer() {
        return destilleringer;
    }
}

package application.model;

import java.util.ArrayList;

public class Flaske {
    private ArrayList<Aftapning> aftapninger;
    private int kapacitetILiter;
    private double alkoholprocent;

    public Flaske(ArrayList<Aftapning> aftapninger, double alkoholprocent) {
        this.aftapninger = aftapninger;
        this.kapacitetILiter = 1;
        this.alkoholprocent = alkoholprocent;
    }

    public ArrayList<Aftapning> getAftapninger() {
        return aftapninger;
    }

    public int getKapacitetILiter() {
        return kapacitetILiter;
    }

    public double getAlkoholprocent() {
        return alkoholprocent;
    }

    public int beregnAntalFlasker(int liter){
        int antalFlasker = 0;
        antalFlasker = liter/kapacitetILiter;

        return antalFlasker;
    }
    @Override
    public String toString() {
        return "Flaske{" +
                "aftapninger=" + aftapninger +
                ", kapacitetILiter=" + kapacitetILiter +
                ", alkoholprocent=" + alkoholprocent +
                '}';
    }
}

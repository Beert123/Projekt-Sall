package storage;

import application.model.Destillat;
import application.model.Destillering;
import application.model.Fad;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Storage {
    private static ArrayList<Fad> fad = new ArrayList<>();
    private static ArrayList<Destillering> destilleringer = new ArrayList<>();
    private static ArrayList<Destillat> destillater = new ArrayList<>();
    public static void addDestillering(Destillering destillering) {
        destilleringer.add(destillering);
    }

    public static ArrayList<Fad> getFad() {
        return fad;
    }

    public static ArrayList<Destillering> getDestilleringer() {
        return destilleringer;
    }

    public static ArrayList<Destillat> getDestillater() {
        return destillater;
    }
}

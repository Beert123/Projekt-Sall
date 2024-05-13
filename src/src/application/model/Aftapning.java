package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aftapning {
    private Fad fad;
    private ArrayList<Destillat> destillat;
    private int literDerFyldesPåFad;
    private LocalDate dato;

    public Aftapning(Fad fad, ArrayList<Destillat> destillat, int literDerFyldesPåFad, LocalDate dato) {
        this.fad = fad;
        this.destillat = destillat;
        this.literDerFyldesPåFad = literDerFyldesPåFad;
        this.dato = dato;
    }
}

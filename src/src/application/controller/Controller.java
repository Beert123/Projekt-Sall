package application.controller;

import application.model.Destillering;
import application.model.Fad;
import storage.Storage;

import java.time.LocalDate;

public class Controller {
    public static Destillering createDestillering(LocalDate startDato, LocalDate slutDato, int maltbatchIGram, String kornsort, int væskeMængdeIMl, double alkoholprocent, String kommentar, String rygemateriale){
        Destillering destillering = new Destillering(startDato, slutDato, maltbatchIGram, kornsort, væskeMængdeIMl, alkoholprocent, kommentar, rygemateriale);
        Storage.addDestillering(destillering);
        return destillering;
    }
    public static Fad createFad(String fadHistore, String tidligereBrug, int placering, String koebssted, String fadNavn, int fadKapacitet){
        Fad fad = new Fad(fadHistore, tidligereBrug, placering, koebssted, fadNavn, fadKapacitet);
        Storage.addFad(fad);
        return fad;
    }

}

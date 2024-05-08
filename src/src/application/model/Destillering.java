package application.model;

import java.time.LocalDate;

public class Destillering {
    private LocalDate startDato;
    private LocalDate slutDato;
    private int maltbatchIGram;
    private String kornsort;
    private int væskeMængdeIMl;
    private double alkoholprocent;
    private String kommentar;
    private String rygemateriale;

    public Destillering(LocalDate startDato, LocalDate slutDato, int maltbatchIGram, String kornsort, int væskeMængdeIMl, double alkoholprocent, String kommentar, String rygemateriale) {
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.maltbatchIGram = maltbatchIGram;
        this.kornsort = kornsort;
        this.væskeMængdeIMl = væskeMængdeIMl;
        this.alkoholprocent = alkoholprocent;
        this.kommentar = kommentar;
        this.rygemateriale = rygemateriale;

    }

    @Override
    public String toString() {
        return "Destillering{" +
                "kommentar='" + kommentar + '\'' +
                '}';
    }
}

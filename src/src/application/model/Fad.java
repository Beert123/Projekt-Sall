package application.model;

public class Fad {
    private String fadHistore;
    private String tidligereBrug;
    private int placering;
    private String koebssted;
    private String fadNavn;
    private int fadKapacitet;

    public Fad(String fadHistore, String tidligereBrug, int placering, String koebssted, String fadNavn, int fadKapacitet) {
        this.fadHistore = fadHistore;
        this.tidligereBrug = tidligereBrug;
        this.placering = placering;
        this.koebssted = koebssted;
        this.fadNavn = fadNavn;
        this.fadKapacitet = fadKapacitet;
    }

    public String getFadHistore() {
        return fadHistore;
    }

    public String getTidligereBrug() {
        return tidligereBrug;
    }

    public int getPlacering() {
        return placering;
    }

    public String getKoebssted() {
        return koebssted;
    }

    public String getFadNavn() {
        return fadNavn;
    }

    public int getFadKapacitet() {
        return fadKapacitet;
    }
}

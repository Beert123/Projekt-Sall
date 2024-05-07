package application.model;

public class Fad {
    private String fadHistore;
    private String tidligereBrug;
    private int placering;
    private String koebssted;
    private String fadNavn;

    public Fad(String fadHistore, String tidligereBrug, int placering, String koebssted, String fadNavn) {
        this.fadHistore = fadHistore;
        this.tidligereBrug = tidligereBrug;
        this.placering = placering;
        this.koebssted = koebssted;
        this.fadNavn = fadNavn;
    }
}

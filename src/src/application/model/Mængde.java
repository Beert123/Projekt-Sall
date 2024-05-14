package application.model;

public class Mængde {
    private int mængde;

    public Mængde(int mængde) {
        this.mængde = mængde;
    }

    @Override
    public String toString() {
        return "Mængde: " +
                "mængde: " + mængde;
    }
}

package guifx;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DestilleringerPane extends VBox {

    public DestilleringerPane() {
        // Opret et nyt grid layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(5);

        // Opret labels og tekstfelter til indtastning af destilleringoplysninger
        Label destilleringLabel = new Label("Destillering:");
        Label datoLabel = new Label("Dato:");
        Label metodeLabel = new Label("Metode:");
        Label destilleriLabel = new Label("Destilleri:");

        TextField datoTextField = new TextField();
        TextField metodeTextField = new TextField();
        TextField destilleriTextField = new TextField();

        // Tilføj labels og tekstfelter til grid layout
        gridPane.add(destilleringLabel, 0, 0);
        gridPane.add(datoLabel, 0, 1);
        gridPane.add(datoTextField, 1, 1);
        gridPane.add(metodeLabel, 0, 2);
        gridPane.add(metodeTextField, 1, 2);
        gridPane.add(destilleriLabel, 0, 3);
        gridPane.add(destilleriTextField, 1, 3);

        // Opret knapper til at gemme og annullere destilleringen
        Button gemButton = new Button("Gem");
        Button annullerButton = new Button("Annuller");

        // Opret en vandret boks til knapperne
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(gemButton, annullerButton);

        // Tilføj knapboksen til grid layout
        gridPane.add(buttonBox, 0, 4, 2, 1);

        // Tilføj grid layout til DestilleringerPane
        getChildren().add(gridPane);
    }
}


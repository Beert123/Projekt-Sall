package guifx;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FadePane extends VBox {

    public FadePane() {
        // Opret et nyt grid layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(5);

        // Opret labels og tekstfelter til indtastning af fadoplysninger
        Label fadnummerLabel = new Label("Fadnummer:");
        Label tidligereIndholdLabel = new Label("Tidligere indhold:");
        Label indholdLabel = new Label("Indhold:");
        Label fadhistorikLabel = new Label("Fadhistorik:");

        TextField fadnummerTextField = new TextField();
        TextField tidligereIndholdTextField = new TextField();
        TextField indholdTextField = new TextField();
        TextField fadhistorikTextField = new TextField();

        // Tilføj labels og tekstfelter til grid layout
        gridPane.add(fadnummerLabel, 0, 0);
        gridPane.add(fadnummerTextField, 1, 0);
        gridPane.add(tidligereIndholdLabel, 0, 1);
        gridPane.add(tidligereIndholdTextField, 1, 1);
        gridPane.add(indholdLabel, 0, 2);
        gridPane.add(indholdTextField, 1, 2);
        gridPane.add(fadhistorikLabel, 0, 3);
        gridPane.add(fadhistorikTextField, 1, 3);

        // Opret knapper til at gemme og annullere fadet
        Button gemButton = new Button("Gem");
        Button annullerButton = new Button("Annuller");

        // Opret en vandret boks til knapperne
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(gemButton, annullerButton);

        // Tilføj knapboksen til grid layout
        gridPane.add(buttonBox, 0, 4, 2, 1);

        // Tilføj grid layout til FadePane
        getChildren().add(gridPane);
    }
}


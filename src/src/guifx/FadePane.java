package guifx;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FadePane extends VBox {


    public FadePane() {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(5);

        Label fadHistorieLabel = new Label("Fadhistorie:");
        TextField fadHistorieTextField = new TextField();
        pane.add(fadHistorieLabel, 0, 0);
        pane.add(fadHistorieTextField, 1, 0);

        Label tidligereBrugLabel = new Label("Tidligere brug:");
        TextField tidligereBrugTextField = new TextField();
        pane.add(tidligereBrugLabel, 0, 1);
        pane.add(tidligereBrugTextField, 1, 1);

        Label placeringLabel = new Label("Placering:");
        TextField placeringTextField = new TextField();
        pane.add(placeringLabel, 0, 2);
        pane.add(placeringTextField, 1, 2);

        Label koebsstedLabel = new Label("Købssted:");
        TextField koebsstedTextField = new TextField();
        pane.add(koebsstedLabel, 0, 3);
        pane.add(koebsstedTextField, 1, 3);

        Label fadNavnLabel = new Label("Fadnavn:");
        TextField fadNavnTextField = new TextField();
        pane.add(fadNavnLabel, 0, 4);
        pane.add(fadNavnTextField, 1, 4);

        Button gemButton = new Button("Gem");
        Button annullerButton = new Button("Annuller");

        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(gemButton, annullerButton);

        pane.add(buttonBox, 0, 5, 2, 1);

        getChildren().add(pane);
    }
}

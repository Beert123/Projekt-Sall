package guifx;
import application.model.Destillat;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DestillaterPane extends VBox {

    private ListView<Destillat> destillatListView;

    public DestillaterPane() {

        destillatListView = new ListView<>();

        destillatListView.setPrefSize(200, 150);

        // Opret en label til at vise overskrift
        Label overskriftLabel = new Label("Destillat Oversigt");

        // Opret en knap til at fylde på fad
        Button fyldPaaFadButton = new Button("Fyld på fad");

        // Opret en layout til knap og overskrift
        HBox headerBox = new HBox(10);
        headerBox.getChildren().addAll(overskriftLabel, fyldPaaFadButton);

        // Opret et grid layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(5);

        // Tilføj ListView til grid layout
        gridPane.add(destillatListView, 0, 0);

        // Tilføj headerBox til grid layout
        gridPane.add(headerBox, 0, 1);

        // Tilføj grid layout til DestillaterPane
        getChildren().add(gridPane);

    }
}

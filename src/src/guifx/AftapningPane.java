package guifx;

import application.model.Aftapning;
import application.model.Fad;
import application.model.Flaske;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import storage.Storage;

public class AftapningPane extends VBox {
    private ListView<Fad> fadListView;
    private ListView<Aftapning> aftapningListView;
    private ListView<Flaske> flaskeListView;
    private TextField fortyndingTF;

    public AftapningPane(){
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(5);

        fadListView = new ListView<>();
        fadListView.getItems().setAll(Storage.getFade());
        fadListView.setPrefSize(600, 100);
        pane.add(fadListView, 0, 0, 2,1);

        aftapningListView = new ListView<>();
        aftapningListView.getItems().setAll(Storage.getAftapninger());
        aftapningListView.setPrefHeight(150);
        pane.add(aftapningListView,0,1);

        fortyndingTF = new TextField();
        fortyndingTF.setPromptText("Indtast fortynding i L");
        pane.add(fortyndingTF,0,2);

        Button fyldPaaFlaskeButton = new Button("Fyld på flaske");
        pane.add(fyldPaaFlaskeButton,0,3);


        getChildren().add(pane);

        fyldPaaFlaskeButton.setOnAction(event -> fyldPaaFlaske());
    }
    private void fyldPaaFlaske(){


    }
}

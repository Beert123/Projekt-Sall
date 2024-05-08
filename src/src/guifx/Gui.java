package guifx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Gui extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Sall Whisky");
        GridPane pane = new GridPane();


        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    // -------------------------------------------------------------------------

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20.0));
        pane.setHgap(20.0);
        pane.setVgap(10.0);
        //___________________________________________________________________________________________

        TabPane tabPane = new TabPane();
        pane.add(tabPane,0,0);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        Tab destilleringerTab = new Tab();
        destilleringerTab.setText("Registrer destillering");
        destilleringerTab.setContent(new DestilleringerPane());
        tabPane.getTabs().add(destilleringerTab);

        Tab fadeTab = new Tab();
        fadeTab.setText("Registrer fad");
        fadeTab.setContent(new FadePane());
        tabPane.getTabs().add(fadeTab);

        Tab destillaterTab = new Tab();
        destillaterTab.setText("Destillater oversigt");
        destillaterTab.setContent(new DestillaterPane());
        tabPane.getTabs().add(destillaterTab);
        pane.setStyle("-fx-background-image: url('https://i0.wp.com/www.forcemajeureaarhus.dk/wp-content/uploads/2023/02/Billede-21.02.2023-14.20.38.jpg?fit=797%2C1116&ssl=1')");
    }
}

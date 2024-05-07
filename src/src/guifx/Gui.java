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

        Tab destilleringerTab = new Tab();
        destilleringerTab.setText("Destilleringer");
        destilleringerTab.setContent(new DestilleringerPane());
        tabPane.getTabs().add(destilleringerTab);

        Tab fadeTab = new Tab();
        fadeTab.setText("Fade");
        fadeTab.setContent(new FadePane());
        tabPane.getTabs().add(fadeTab);
    }
}
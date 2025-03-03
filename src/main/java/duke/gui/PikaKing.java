package duke.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import duke.Duke;

/**
 * A GUI for Duke using FXML.
 */
public class PikaKing extends Application {

    private Duke duke = new Duke("dataTasks.txt");

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(PikaKing.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setDuke(duke);
            stage.setTitle("PikaKing");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

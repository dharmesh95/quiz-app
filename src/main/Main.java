package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

import static constants.PathConstants.CSS_PATH;
import static constants.PathConstants.LOGIN_FXML_PATH;
import static constants.SceneConstants.*;

public class Main extends Application {

    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;

        Main.navigate(LOGIN_FXML_PATH, LOGIN_TITLE, CSS_PATH);

        primaryStage.show();
    }

    public static void navigate(String fxmlPath, String title, String cssPath) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource(fxmlPath));
        Main.primaryStage.setTitle(title);

        Scene scene = new Scene(root, SCENE_HEIGHT, SCENE_WIDTH);
        scene.getStylesheets().add(cssPath);
        Main.primaryStage.setScene(scene);
    }
}

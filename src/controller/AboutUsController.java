package controller;

import javafx.fxml.FXML;
import main.Main;

import java.io.IOException;

import static constants.PathConstants.CSS_PATH;
import static constants.PathConstants.HOME_FXML_PATH;
import static constants.SceneConstants.HOME_TITLE;

public class AboutUsController {

    @FXML
    private void back() {
        try {
            Main.navigate(HOME_FXML_PATH, HOME_TITLE, CSS_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

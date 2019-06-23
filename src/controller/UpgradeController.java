package controller;

import javafx.fxml.FXML;

import java.io.IOException;

import static constants.PathConstants.CSS_PATH;
import static constants.PathConstants.PROFILE_FXML_PATH;
import static constants.SceneConstants.PROFILE_TITLE;
import static main.Main.navigate;

public class UpgradeController {

    @FXML
    private void back() {
        try {
            navigate(PROFILE_FXML_PATH, PROFILE_TITLE, CSS_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

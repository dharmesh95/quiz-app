package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import static constants.PathConstants.*;
import static constants.SceneConstants.HOME_TITLE;
import static constants.SceneConstants.REGISTER_TITLE;
import static main.Main.navigate;

public class LoginController {

    @FXML
    private TextField textFieldEmail;
    @FXML
    private TextField textFieldPassword;
    @FXML
    private Label errorEmail;
    @FXML
    private Label errorPassword;

    @FXML
    public void login(ActionEvent actionEvent) {
        if (textFieldEmail.getText().isEmpty() || !textFieldEmail.getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")) {
            errorEmail.setText("Invalid Email id found");
            /*      ^                 # start-of-string
                    (?=.*[0-9])       # a digit must occur at least once
                    (?=.*[a-z])       # a lower case letter must occur at least once
                    (?=.*[A-Z])       # an upper case letter must occur at least once
                    (?=.*[@#$%^&+=])  # a special character must occur at least once
                    (?=\S+$)          # no whitespace allowed in the entire string
                    .{8,}             # anything, at least eight places though
                    $                 # end-of-string*/
        } else if (textFieldPassword.getText().isEmpty() ||
                !textFieldPassword.getText().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
            errorPassword.setText("Invalid Password found");
        } else {
            errorEmail.setText("");
            errorPassword.setText("");
            errorEmail.setText("Login in successful");
            try {
                navigate(HOME_FXML_PATH, HOME_TITLE, CSS_PATH);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public void register() {
        try {
            navigate(REGISTER_FXML_PATH, REGISTER_TITLE, CSS_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void playAsGuest() {
        try {
            navigate(HOME_FXML_PATH, HOME_TITLE, CSS_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

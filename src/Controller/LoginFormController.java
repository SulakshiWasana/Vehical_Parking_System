package Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public AnchorPane LoginFormContext;
    public JFXTextField txtname;
    public JFXTextField txtpsw;

    public void LoginOnAction(ActionEvent actionEvent) throws IOException {
        if (txtname.getText().equals("Sulakshi") & txtpsw.getText().equals("12345")) {
            URL resource = getClass().getResource("../view/InParkingForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) LoginFormContext.getScene().getWindow();
            window.setScene(new Scene(load));
        } else {
        }
    }

    public void CancelOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) LoginFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
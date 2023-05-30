package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class InParkingFormController {
    public AnchorPane InParkingFormContext;
    public TableView tblParkingTable;
    public TableColumn colVehiNum;
    public TableColumn colVehiType;
    public TableColumn colParkSlot;
    public TableColumn colParkTime;
    public ComboBox cmbInParking;

    public void initialize(){
        cmbInParking.getItems().addAll("On Delivery");
    }


    public void OnDeliveryOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/OnDeliveryForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) InParkingFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AddVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehicleForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) InParkingFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AddDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) InParkingFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) InParkingFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

}


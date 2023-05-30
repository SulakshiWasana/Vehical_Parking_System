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

public class OnDeliveryFormController {
    public AnchorPane OnDeliverFormContext;
    public TableView tblOnDeliveryTable;
    public TableColumn colVehiNum2;
    public TableColumn ColVehiType2;
    public TableColumn colDName;
    public TableColumn colLeftTime;
    public ComboBox cmbOnDelivery;

    public void initialize(){
        cmbOnDelivery.getItems().addAll("In Parking");
    }


    public void InParkingOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/InParkingForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) OnDeliverFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AddVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehicleForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) OnDeliverFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AddDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) OnDeliverFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}

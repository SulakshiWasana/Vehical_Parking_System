package Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomePageFormController {
    public AnchorPane HomepageContext;
    public JFXTextField DigitalClock;
    public JFXTextField DateFormat;
    public ComboBox cmbVehicle;
    public ComboBox cmbDriver;
    public JFXTextField txtSlot;
    public JFXTextField txtVehicleType;

    private void digitalClock() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("  HH:mm:ss");
            DigitalClock.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    private void dateFormat() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("  yyyy:MM:dd");
            DateFormat.setText(LocalDateTime.now().format(formatter1));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    private void Vehicle() {
        cmbVehicle.getItems().addAll("NA-3434", "KA-4563", "58-3567", "GF-4358", "CCB-3568",
                "LM-6679", "QA-3369", "KB-3668", "JJ-9878", "GH-5772",
                "XY-4456", "YQ-3536", "CBB-3566", "QH-3444");
    }

    private void Driver() {
        cmbDriver.getItems().addAll("Sumith Kumara", "Amila Pathirana", "Jithmal Perera", "Sumith Dissanayaka", "Sumanasiri Herath",
                "Awantha Fernando", "Charith Sudara", "Prashan Dineth", "Chethiya Dilan", "Dushantha Perera",
                "Sumith Udayanga", "Dinesh Udara", "Udana Chathuranga", "Mohommad Riaz", "Sandun Kumara", "Priyanga Perera");
    }

    public void SelectVehicle(ActionEvent actionEvent) {}
    public void SelectDriver(ActionEvent actionEvent) {}
    public void SlotMethod(ActionEvent actionEvent) {}

    private String[] Vehicle = {"NA-3434", "KA-4563", "58-3567", "GF-4358", "CCB-3568", "LM-6679", "QA-3369", "KB-3668",
            "JJ-9878", "GH-5772", "XY-4456", "YQ-3536", "CBB-3566", "QH-3444"};

    private void getVehicle(javafx.event.Event event) {
        String vehical = (String) cmbVehicle.getValue();
        String[] van = {"KA-4563", "58-3567", "GF-4358", "CCB-3568", "LM-6679", "QA-3369"};
        String[] lorry = {"KB-3668", "JJ-9878", "GH-5772", "XY-4456", "YQ-3536", "CBB-3566", "QH-3444"};

        if (vehical.equals("NA-3434")) {
            txtVehicleType.setText("           Bus   ");
            for(int i=0;i<busSlot.length;i++){
                txtSlot.setText(busSlot[i]);


            }

        } else {
            for (int i = 0; i <van.length; i++) {
                if (vehical.equals(van[i])) {
                    txtVehicleType.setText("          Van  ");
                    for(int k=0;k<vanSlot.length;k++){
                        if(vanSlot[i]!=""){
                            txtSlot.setText(vanSlot[i]);
                        }
                      }
                    }
                }
            }
                for (int i = 0; i < lorry.length; i++) {
                    if (vehical.equals(lorry[i])) {
                        txtVehicleType.setText("         Cargo Lorry   ");
                        if(cargoLorrySlot[i]!=""){
                            txtSlot.setText(cargoLorrySlot[i]);
                        }
                    }
                }
            }

            String[] vanSlot = new String[6];{
                vanSlot[0] = "        1";
                vanSlot[1] = "        2";
                vanSlot[2] = "        3";
                vanSlot[3] = "        4";
                vanSlot[4] = "        12";
                vanSlot[5] = "        13";
            }

            String[] cargoLorrySlot = new String[7];{
                cargoLorrySlot[0] = "       5";
                cargoLorrySlot[1] = "       6";
                cargoLorrySlot[2] = "       7";
                cargoLorrySlot[3] = "       8";
                cargoLorrySlot[4] = "       9";
                cargoLorrySlot[5] = "       10";
                cargoLorrySlot[6] = "       11";
            }

            String[] busSlot = new String[1];{
                busSlot[0] = "        14";
            }

        public void initialize () {
            digitalClock();
            dateFormat();
            Vehicle();
            Driver();
            cmbVehicle.getItems().addAll(Vehicle);
            cmbVehicle.setOnAction(this::getVehicle);
        }

    public void LoginFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HomepageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}


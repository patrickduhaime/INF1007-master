/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewController;
import Assets.Constants;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
/**
 *
 * @author VIN
 */
public class MainNavigateController {
  

    @FXML
    private Pane NavPanel;
   
      @FXML
    public void initialize() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(Constants.ADDMEMBER_PATH_FXML));
        fxmlLoader.setController(new AjoutMembreViewController());
        Pane pane = (Pane)fxmlLoader.load();
        NavPanel.getChildren().add(pane);
    }
    @FXML
    void AjoutMembre_Click(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(Constants.ADDMEMBER_PATH_FXML));
        fxmlLoader.setController(new AjoutMembreViewController());
        Pane pane = (Pane)fxmlLoader.load();
        NavPanel.getChildren().add(pane);
    }

    @FXML
    void Reservation_Click(ActionEvent event) throws IOException {
        NavPanel.getChildren().clear();
        FXMLLoader fxmlLoader  =  new FXMLLoader(getClass().getResource(Constants.RESERVATION_PATH_FXML));
        fxmlLoader.setController(new ReservationViewController());
        Pane pane = (Pane)fxmlLoader.load();
        NavPanel.getChildren().add(pane);
    }
    
      @FXML
    void Paiment_Click(ActionEvent event) throws IOException {
        NavPanel.getChildren().clear();
        FXMLLoader fxmlLoader  = new  FXMLLoader(getClass().getResource(Constants.PAIEMENT_PATH_FXML));
        fxmlLoader.setController(new PaiementViewController());
        Pane pane = (Pane)fxmlLoader.load();
        NavPanel.getChildren().add(pane);
    }

      @FXML
    void Location_Click(ActionEvent event) throws IOException {
        NavPanel.getChildren().clear();
        FXMLLoader fxmlLoader  =  new FXMLLoader(getClass().getResource(Constants.LOCATION_PATH_FXML));
        fxmlLoader.setController(new LocationViewController());
        Pane pane = (Pane)fxmlLoader.load();
        NavPanel.getChildren().add(pane);
    }
   
   
}

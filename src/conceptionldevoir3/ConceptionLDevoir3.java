/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptionldevoir3;

import Assets.Constants;
import Models.Membre;
import Services.MembreServices;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ViewController.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author VIN
 */
public class ConceptionLDevoir3 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
     // CreateFakeDataMembers();
      String fxmlResource = Constants.NAVPATH_FXML;      
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlResource));
      fxmlLoader.setController(new MainNavigateController());
      Parent root = (Parent)fxmlLoader.load();
      root.getStylesheets().add(getClass().getResource(Constants.PATH_BOOSTRAP).toExternalForm());    
      Stage stage = new Stage(); 
      stage.setTitle(Constants.WINDOW_TITLE); 
      stage.setScene(new Scene(root));
      stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        int rndRue = new ThreadLocalRandom().current().nextInt(1,169);
        int rndPhone  = new ThreadLocalRandom().current().nextInt(1212,9999);
        int rndPermis  = new ThreadLocalRandom().current().nextInt(,9999);
        try{

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con;

            con = DriverManager.getConnection(
                            "jdbc:oracle:thin:@neptune.uqtr.ca:1521:coursbd","SMI1002_07","26nbkv28");

            Statement stmt=con.createStatement();
            stmt.executeQuery("insert into CLIENT (NOM, PRENOM, ADRESSE, NOTEL, NOPERMIS) VALUES (Client"+i+",Nom"+i+ ", " + rndRue + "ieme Avenue\, Montreal\, Quebec\, H2L-7B2, 514-555-" + rndPhone + " " + rndPermis);


            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
    
     private void CreateFakeDataMembers(){
            MembreServices.getInstance().insertMember(new Membre("Thomas","Jeff","38 des la hate","JFF7865FR","Ste-Marthe","Quebec","JFk@asd.com","215-888-9895","Canada","H6RU4E"));
          MembreServices.getInstance().insertMember(new Membre("Marie","Jeff","67 marion","Maria8865FR","Ste-Marthe","Quebec","JFk@asd.com","215-888-9895","Canada","H6RU4E"));
          MembreServices.getInstance().insertMember(new Membre("Thomas","Jeff","38 des la hate","JFF7865FR","Ste-Marthe","Quebec","JFk@asd.com","215-888-9895","Canada","H6RU4E"));
          MembreServices.getInstance().insertMember(new Membre("Annie","Martin","78 de l'amour","Annie8865FR","Ste-Marthe","Quebec","JFk@asd.com","215-888-9895","Canada","H6RU4E"));
          MembreServices.getInstance().insertMember(new Membre("Marco","Biron","77 des la hate","MRC87346yy","Ste-Marthe","Quebec","JFk@asd.com","215-888-9895","Canada","H6RU4E"));
          MembreServices.getInstance().insertMember(new Membre("Norma","Jones","44782 marionne","NOORMY65FR","Ste-Marthe","Quebec","JFk@asd.com","215-888-9895","Canada","H6RU4E"));
        }
}
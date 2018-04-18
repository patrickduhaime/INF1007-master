/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.Membre;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author VIN
 */
public class MockDbSimulator {
    // Pour chaque table il faudra une liste
     private ObservableList<Membre> TableMembre; 
     //Constructeur  
           private MockDbSimulator()
    {
       TableMembre = FXCollections.observableArrayList();
    }
    /** Instance unique non préinitialisée */
    private static MockDbSimulator INSTANCE = null;
     
    /** Point d'accès pour l'instance unique du singleton */
    public static MockDbSimulator getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new MockDbSimulator(); 
        }
        return INSTANCE;
    }
    
    // SIMULATION DE LA TABLE MEMBRE
    public ObservableList<Membre> getMembres()  {
        return TableMembre;
    }
    public void insertMembre(Membre nouveauMembre)  {
        TableMembre.add(nouveauMembre);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.Membre;
import java.util.ArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author VIN
 */
public class MembreServices { 
    private ObservableList<Membre> Membres; 
    private MembreServices()
    {
       refreshMembers();
    }
     
    /** Instance unique non préinitialisée */
    private static MembreServices INSTANCE = null;
     
    /** Point d'accès pour l'instance unique du singleton */
    public static MembreServices getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new MembreServices(); 
        }
        return INSTANCE;
    }
    
    public void refreshMembers(){
     Membres = MockDbSimulator.getInstance().getMembres();
    }
    
    public void insertMember(Membre membre){
     MockDbSimulator.getInstance().insertMembre(membre);
    }
    public ObservableList<Membre> getMembers(){
     return Membres;
    }
    
    
}

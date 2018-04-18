/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author VIN
 */
public final class sMembre {

    // For tableview show
    public SimpleStringProperty sNom;
    private SimpleStringProperty sPrenom;
    private SimpleStringProperty sAdresse;
    private SimpleStringProperty sNopermis;
    private SimpleStringProperty sVille;
    private SimpleStringProperty sEtat;
    private SimpleStringProperty sEmail;
    private SimpleStringProperty sTelephone;
    private SimpleStringProperty sPays;
    private SimpleStringProperty sCodePostal;

    public sMembre(String Nom, String Prenom, String Adresse, String Nopermis, String Ville, String Etat, String Email, String Telephone, String Pays, String CodePostal) {
        this.sNom = new SimpleStringProperty(Nom);
        this.sPrenom = new SimpleStringProperty(Prenom);
        this.sAdresse = new SimpleStringProperty(Adresse);
        this.sNopermis = new SimpleStringProperty(Nopermis);
        this.sVille = new SimpleStringProperty(Ville);
        this.sEtat = new SimpleStringProperty(Etat);
        this.sEmail = new SimpleStringProperty(Email);
        this.sTelephone = new SimpleStringProperty(Telephone);
        this.sPays = new SimpleStringProperty(Pays);
        this.sCodePostal = new SimpleStringProperty(CodePostal);
    }

    public final String getSNom() {
        return sNom.get();
    }

    public final void setsNom(String sNom) {
        this.sNom.set(sNom);
    }

    public final String getSPrenom() {
        return sPrenom.get();
    }

    public final void setsPrenom(String sPrenom) {
        this.sPrenom.set(sPrenom);
    }

    public final String getSAdresse() {
        return sAdresse.get();
    }

    public final void setsAdresse(String sAdresse) {
        this.sAdresse.set(sAdresse);
    }

    public final String getSNoPermis() {
        return sNopermis.get();
    }

    public final void setsNopermis(String sNopermis) {
        this.sNopermis.set(sNopermis);
    }

    public final String getSVille() {
        return sVille.get();
    }

    public void setsVille(String sVille) {
        this.sVille.set(sVille);
    }

    public final String getSEtat() {
        return sEtat.get();
    }

    public final void setsEtat(String sEtat) {
        this.sEtat.set(sEtat);
    }

    public final String getSEmail() {
        return sEmail.get();
    }

    public final void setsEmail(String sEmail) {
        this.sEmail.set(sEmail);
    }

    public final String getSTelephone() {
        return sTelephone.get();
    }

    public final void setsTelephone(SimpleStringProperty sTelephone) {
        this.sTelephone = sTelephone;
    }

    public final String getSPays() {
        return sPays.get();
    }

    public final void setsPays(SimpleStringProperty sPays) {
        this.sPays = sPays;
    }

    public final String getSCodePostal() {
        return sCodePostal.get();
    }

    public final void setsCodePostal(SimpleStringProperty sCodePostal) {
        this.sCodePostal = sCodePostal;
    }

} 

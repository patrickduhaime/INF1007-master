/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Assets.Constants;

import java.util.Random;

/**
 * @author VIN
 */
public class Membre {


    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Nopermis;
    private String Ville;
    private String Etat;
    private String Email;
    private String Telephone;
    private String Pays;
    private String CodePostal;
    private String MotDePasse;


    public Membre(String Nom, String Prenom, String Adresse, String Nopermis, String Ville, String Etat, String Email, String Telephone, String Pays, String CodePostal) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.Nopermis = Nopermis;
        this.Ville = Ville;
        this.Etat = Etat;
        this.Email = Email;
        this.Telephone = Telephone;
        this.Pays = Pays;
        this.CodePostal = CodePostal;
        this.MotDePasse = generateMotDePasse(8);
    }

    public String getPays() {
        return Pays;
    }

    public void setPays(String Pays) {
        this.Pays = Pays;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(String CodePostal) {
        this.CodePostal = CodePostal;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getNopermis() {
        return Nopermis;
    }

    public void setNopermis(String Nopermis) {
        this.Nopermis = Nopermis;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String Etat) {
        this.Etat = Etat;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    private String generateMotDePasse(int longueur) {
        char[] validchars = Constants.GENERATEDCHARS_STRING.toCharArray();
        char[] password = new char[longueur];
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < longueur; i++) {
            password[i] = validchars[rand.nextInt(validchars.length)];
        }
        return new String(password);
    }

}

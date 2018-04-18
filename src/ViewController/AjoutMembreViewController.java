/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewController;

import Assets.Constants;
import Models.Membre;
import Models.sMembre;
import Services.MembreServices;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * @author VIN
 */
public class AjoutMembreViewController {

    @FXML
    private TextField TxtFldNom;

    @FXML
    private TextField TxtFldPrenom;

    @FXML
    private TextField TxtFldAdresse;

    @FXML
    private TextField TxtFldVille;

    @FXML
    private TextField TxtFldEtat;

    @FXML
    private TextField TxtFldEmail;

    @FXML
    private TextField TxtFldTel;

    @FXML
    private ComboBox<?> CmbBxPays;

    @FXML
    private TextField TxtFldZipCode;

    @FXML
    private TextField TxtFldNoPermis;

    @FXML
    private Button BtCancel;

    @FXML
    private Button BtAddMember;
    @FXML
    private TableView<sMembre> TableviewMembres;
    @FXML
    private TableColumn<sMembre, String> ColNom;
    @FXML
    private TableColumn<sMembre, String> ColPrenom;
    @FXML
    private TableColumn<sMembre, String> ColAdresse;
    @FXML
    private TableColumn<sMembre, String> ColNoPermis;
    @FXML
    private TableColumn<sMembre, String> ColPays;
    @FXML
    private TableColumn<sMembre, String> ColTelephone;
    @FXML
    private TableColumn<sMembre, String> ColZipCode;

    @FXML
    void AddMember_Click(ActionEvent event) {
        if (validField() && validateUniqueEntry()) {
            Membre newMembre = createMember();
            showAlert(Constants.INFORMATION, Constants.MEMBER_ADDED + Constants.NEXTLINE + Constants.NOM + Constants.SPACE + newMembre.getNom() +
                    Constants.NEXTLINE + Constants.PASSWORD + Constants.SPACE + newMembre.getMotDePasse());
            MembreServices.getInstance().insertMember(newMembre);
            refreshTableview();
        } else {
            if (!validateUniqueEntry()) {
                showAlert(Constants.INFORMATION, Constants.NOPERMISERROR);
            } else {
                showAlert(Constants.INFORMATION, Constants.EMPTYFIELDdMSG);

            }
        }
    }

    @FXML
    void ListRefresh_Click(ActionEvent event) {
        refreshTableview();
    }

    @FXML
    void Cancel_Click(ActionEvent event) {

    }

    @FXML
    public void initialize() {
        InitUI();
        initColumnValue();
        refreshTableview();
    }

    public void initColumnValue() {
        //Set Col value
        ColNom.setCellValueFactory(
                new PropertyValueFactory<sMembre, String>("sNom"));
        ColPrenom.setCellValueFactory(
                new PropertyValueFactory<sMembre, String>("sPrenom"));
        ColAdresse.setCellValueFactory(
                new PropertyValueFactory<sMembre, String>("sAdresse"));
        ColNoPermis.setCellValueFactory(
                new PropertyValueFactory<sMembre, String>("sNoPermis"));
        ColPays.setCellValueFactory(
                new PropertyValueFactory<sMembre, String>("sPays"));
        ColTelephone.setCellValueFactory(
                new PropertyValueFactory<sMembre, String>("sTelephone"));
        ColZipCode.setCellValueFactory(
                new PropertyValueFactory<sMembre, String>("sCodePostal"));
    }


    public void refreshTableview() {
        ObservableList<sMembre> data = FXCollections.observableArrayList();
        for (Membre member : MembreServices.getInstance().getMembers()) {
            System.out.println(member.getNom());
            data.add(new sMembre(member.getNom(), member.getPrenom(), member.getAdresse(), member.getNopermis(), member.getVille(), member.getEtat(), member.getEmail(), member.getTelephone(), member.getPays(), member.getCodePostal()));
        }
        TableviewMembres.setEditable(true);
        TableviewMembres.setItems(data);
        TableviewMembres.refresh();
    }

    public Membre createMember() {
        String paysvalue = CmbBxPays.getValue().toString();
        return new Membre(TxtFldNom.getText(),
                TxtFldPrenom.getText(),
                TxtFldAdresse.getText(),
                TxtFldNoPermis.getText(),
                TxtFldVille.getText(),
                TxtFldEtat.getText(),
                TxtFldEmail.getText(),
                TxtFldTel.getText(),
                paysvalue,
                TxtFldZipCode.getText()
        );

    }

    public boolean validateUniqueEntry() {

        for (Membre member : MembreServices.getInstance().getMembers()) {
            if (TxtFldNoPermis.getText().equals(member.getNopermis())) {
                return false;
            }
        }
        return true;
    }

    public void InitUI() {
        ObservableList al = FXCollections.observableArrayList();
        al.add(Constants.CA);
        al.add(Constants.US);
        al.add(Constants.BELG);
        al.add(Constants.URSS);
        al.add(Constants.ESPAGNE);
        al.add(Constants.MAROC);
        al.add(Constants.BULGARIE);
        al.add(Constants.SENEGAL);
        al.add(Constants.CAMEROUN);
        CmbBxPays.getItems().addAll(al);
        CmbBxPays.getSelectionModel().select(0);
    }

    public void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText("Information");
        alert.setContentText(msg);
        alert.showAndWait();
    }

    public boolean validField() {
        return !(TxtFldNom.getText() == null || TxtFldNom.getText().equals("") ||
                TxtFldPrenom.getText() == null || TxtFldPrenom.getText().equals("") ||
                TxtFldAdresse.getText() == null || TxtFldAdresse.getText().equals("") ||
                TxtFldNoPermis.getText() == null || TxtFldNoPermis.getText().equals("") ||
                TxtFldVille.getText() == null || TxtFldVille.getText().equals("") ||
                TxtFldEtat.getText() == null || TxtFldEtat.getText().equals("") ||
                TxtFldEmail.getText() == null || TxtFldEmail.getText().equals("") ||
                TxtFldTel.getText() == null || TxtFldTel.getText().equals("") ||
                TxtFldZipCode.getText() == null || TxtFldZipCode.getText().equals(""));
    }
}

 
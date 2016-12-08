/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.DashboardController;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


/**
 * FXML Controller class
 *
 * @author Joren
 */
public class Dashboard extends GridPane
{
    // ATTRIBUTEN
    private DashboardController dbc;
    
    private final Image greenLight = new Image(getClass()
            .getResource("green-light.png")
            .toExternalForm());
    private final Image redLight = new Image(getClass()
            .getResource("red-light.png")
            .toExternalForm());
    @FXML
    private ImageView imgAlarm, imgSound, imgDistance, imgLight, imgClimate;
    @FXML
    private Label lblSound;
    @FXML
    private Label lblDistance;
    @FXML
    private Label lblLight;
    @FXML
    private Label lblTemperature;
    @FXML
    private Label lblHumidity;
    
    // CONSTRUCTOR
    public Dashboard(DashboardController dbc) 
    {
        this.dbc = dbc;
        // load fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
        loader.setController(this);
        loader.setRoot(this);        
        try{
            loader.load();
        }
        catch(IOException ex)
        {
            throw new RuntimeException(ex.getMessage());
        }
       // initialize values
       setAllLightsGreen();
       initializeValues();
    }    
    // GETTERS, SETTERS
    // ANDERE METHODES
    private void setAllLightsGreen() 
    {
        imgAlarm.setImage(greenLight);
        imgSound.setImage(greenLight);
        imgDistance.setImage(greenLight);
        imgLight.setImage(greenLight);
        imgClimate.setImage(greenLight);
    }
    private void initializeValues()
    {
        lblSound.setText(String.format("%d", 0));
        lblDistance.setText(String.format("%d", 0));
        lblLight.setText(String.format("%d", 0));
        lblTemperature.setText(String.format("%d", 0));
        lblHumidity.setText(String.format("%d", 0));
    }
}

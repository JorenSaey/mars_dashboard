/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;


/**
 * FXML Controller class
 *
 * @author Joren
 */
public class Dashboard extends GridPane
{
    // ATTRIBUTEN
    // CONSTRUCTOR
    public Dashboard() 
    {
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
    }    
    // GETTERS, SETTERS
    // ANDERE METHODES
}

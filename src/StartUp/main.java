/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartUp;

import gui.Dashboard;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Joren
 */
public class main extends Application
{
    public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        stage.setTitle("Mars dashboard");
        stage.setScene(new Scene(new Dashboard(),800,600));
        stage.show();
    }
}

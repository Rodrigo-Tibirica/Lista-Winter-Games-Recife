/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author tibir
 */
public class Main  extends Application{
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
         
        Pane painel = FXMLLoader.load(this.getClass().getResource("Palco.fxml"));
        Scene cena = new Scene(painel);
        primaryStage.setScene(cena);
        primaryStage.show();
        //To change body of generated methods, choose Tools | Templates.
    }
    
}

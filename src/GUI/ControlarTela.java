/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Negocios.Beans.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author tibir
 */
public class ControlarTela implements EventHandler<Event>{
    @FXML
    private ChoiceBox<TipoDeMedalhas> BoxTipo;
    @FXML
    private ChoiceBox<Pais> BoxPais;
    @FXML
    private ChoiceBox<Modalidade> BoxModalidade;
    @FXML
    private Button BtnAdd;
    @FXML
    private Button BtnRmv;
    @FXML
    private Button BtnUp;
    @FXML
    private Button BtnPais;
    @FXML 
    private Button BtnModalidade;
     
    public void initialize(){
        BoxTipo.getItems().addAll(TipoDeMedalhas.values());
        BoxPais.getItems().addAll(Pais.values());
        BoxModalidade.getItems().addAll(Modalidade.values());
        
        
    }

    @Override
    public void handle(Event event) {
        if(event.getSource().equals(BtnAdd)){
            
        }
        if(event.getSource().equals(BtnUp)){
            
        }
        if(event.getSource().equals(BtnRmv)){
            
        }
        if(event.getSource().equals(BtnPais)){
            
        }
        if(event.getSource().equals(BtnModalidade)){
            
        }
     
       
    }
    
    
}

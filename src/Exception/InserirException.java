/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import Negocios.Beans.Medalha;
import java.util.ArrayList;

/**
 *
 * @author tibir
 */
public class InserirException extends Exception {
      private Medalha medalhaRandom;
    
    public InserirException(Medalha medalhaRandom){
        super("Elemento já existente");
        this.medalhaRandom = medalhaRandom;
    }
    public Medalha getMedalhaRandom() {
        return medalhaRandom;
    }
    public void setMedalhaRandom(Medalha medalhaRandom) {
        this.medalhaRandom = medalhaRandom;
    }
    
    
}

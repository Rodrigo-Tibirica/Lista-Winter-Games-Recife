/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import Negocios.Beans.Medalha;


public class AtualizarException extends Exception{
      private Medalha medalhaRandom;
    
    public AtualizarException(Medalha medalhaRandom){
        super("Elemento não existente");
        this.medalhaRandom = medalhaRandom;
    }

    public Medalha getMedalhaRandom() {
        return medalhaRandom;
    }

    public void setMedalhaRandom(Medalha medalhaRandom) {
        this.medalhaRandom = medalhaRandom;
    }
    
    
}

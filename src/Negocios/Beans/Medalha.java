package Negocios.Beans;

import java.util.Objects;

public class Medalha {

private Modalidade modalidade;	
private Pais pais;
private TipoDeMedalhas tipoDeMedalhas;

    public Modalidade getModalidade() {
        return modalidade;
    }




    @Override
     public boolean equals(Object obj){
        boolean result = false;
        if( obj instanceof Medalha){
        Medalha m = (Medalha) obj;
        if(this.modalidade.equals(m.getModalidade())){
            result = true;
           }
        
        }
      return result;
    }
}
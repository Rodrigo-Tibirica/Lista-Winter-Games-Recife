package Negocios;

import Dados.*;
import Exception.AtualizarException;
import Exception.InserirException;
import Exception.RemoverException;
import Negocios.Beans.Medalha;
import java.util.Collections;
import java.util.List;

public class Controlador {

    private RepositorioDeMedalhas repositorioMedalhas;

    public Controlador() {
        this.repositorioMedalhas = RepositorioDeMedalhas.getinstance();
    }

    public void inserir(Medalha medalhas) throws InserirException {
        repositorioMedalhas.inserir(medalhas);
    }
    public void remover(Medalha medalha) throws RemoverException {
       repositorioMedalhas.remover(medalha);
    }
    public void atualizar(Medalha velha, Medalha nova ) throws AtualizarException{
      repositorioMedalhas.atualizar(velha, nova);
    }
    public List Listar(){
          return repositorioMedalhas.Listar();
    }
     

    public void ordenarMedalhasModalidade() {

    }

    public void ordernarMedalhasPais() {

    }

    public void calcularPosiçãodoPaisnoRankin() {

    }

    public void Calculartotaldemedalhasporpaísetipo() {

    }

    /* ordenação de pais
     public int compareTo (Pais p){
     int resulta = 0;
     if (this.mediaGeral <p.)
     result -1;
     }else if (this.mediageral =={
    
     result 1
    
    
     }
     //Collections.sort()
     */
    //compareTo.String
//comparar outro implements comparator <Modalidade>
    /*public int compare(Modalidade 1, Modalidade 2){
            
            
            return o1.getmodalidade().compareTo(Modalidade2.getModalidade)
    }
   */
}

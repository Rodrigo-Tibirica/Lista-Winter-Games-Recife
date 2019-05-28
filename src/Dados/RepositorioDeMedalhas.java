package Dados;

import Negocios.Beans.Medalha;
import com.sun.javafx.UnmodifiableArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import Exception.*;

public class RepositorioDeMedalhas {

    private ArrayList <Medalha> medalha;
    
    private static RepositorioDeMedalhas instance;
    
    private RepositorioDeMedalhas () {
        
        this.medalha = new ArrayList<Medalha>();
        
    }
    
    public static RepositorioDeMedalhas getinstance () {
        
        if (instance == null){
            RepositorioDeMedalhas.instance = new RepositorioDeMedalhas();
            
        } else{
            
            
        }
        return instance;
        
    }
    public void inserir (Medalha medalhas) throws InserirException{
        if (!this.medalha.contains(medalhas)){
              if(!this.medalha.equals(medalhas)){
            medalha.add(medalhas);
        }else{
                  throw new InserirException(medalhas);
        }
      }
    }
    
    public List Listar(){
          return Collections.unmodifiableList(medalha);
    }
    
    
    public void remover (Medalha medalha) throws RemoverException{
        if(this.medalha.contains(medalha)){
          
        this.medalha.remove(medalha);
        }
        else{ 
             throw new RemoverException(medalha);
            }
        
        
    }
    public void atualizar(Medalha velha, Medalha nova ) throws AtualizarException{
        if(!this.medalha.contains(nova)){
            
            this.medalha.set(medalha.indexOf(velha), nova);
                    }
        else {
            throw new AtualizarException(velha);
        }
    }
    
    
    
    
    }

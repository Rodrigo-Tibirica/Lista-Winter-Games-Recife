package Negocios.Beans;

public enum TipoDeMedalhas {

OURO ("Ouro"),
PRATA("Prata"),
BRONZE("Bronze");

private String medalhaTipo;

TipoDeMedalhas (String nome){
    
    this.medalhaTipo = medalhaTipo;
    
}

    public String getMedalhaTipo() {
        return medalhaTipo;
    }
    

/*@Override
    public boolean equals (Object obj){
        
        boolean igual = false;
        
        if (obj instanceof TipoDeMedalhas){
            
            TipoDeMedalhas t = (TipoDeMedalhas) obj;
            if (this.)
            
        }
        
    }*/
    
}


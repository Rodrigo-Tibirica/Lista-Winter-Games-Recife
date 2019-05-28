package Negocios.Beans;

public enum Pais {

    BRA("Brasil"),
    ARG("Argentina"),
    CAN("Canadá"),
    CHN("China"),
    USA("Estados Unidos"),
    COL("Colômbia"),
    CUB("Cuba"),
    MEX("Mexico"),
    RUS("Russia"),
    FRA("France"),
    DEN("Dinamarca"),
    CRO("Croácia"),
    CZE("República Checa"),
    EGY("Egito"),
    ESP("Espanha"),
    PRT("Portugal"),
    PER("Peru"),
    CHL("Chile"),
    ITA("Italy"),
    URY("Uruguay");

    private String paisNome;

    Pais(String nome) {

        this.paisNome = nome;

    }

    public String getPaisNome() {
        return paisNome;
    }
}

package Negocios.Beans;

public enum Modalidade {

    CURLING("Curling"),
    ESQUI_ALPINO("Esqui alpino"),
    ESQUI_COUNTRY("Esqui cross-country"),
    ESQUI_LIVRE("Esqui estilo livre"),
    HOQUEI("Hóquei no gelo"),
    PATINACAO_ARTISTICA("Patinação artística"),
    PATINACAO_VELOCIDADE("Patinação de velocidade"),
    SALTO_ESQUI("Salto de esqui"),
    SNOWBOARD("Snowboard");

    private String nomeModalidade;

    Modalidade(String nome) {

        this.nomeModalidade = nomeModalidade;

    }

    public String getNomeModalidade() {
        return nomeModalidade;
    }

    /*@Override
   public boolean equals(Object obj){

        boolean resultado = false;

        if(obj instanceof Modalidade) {

            Modalidade m = (Modalidade) obj;
            if (this.nomeModalidade.equals(m.getNomeModalidade())) {

                resultado = true;
            }

        }
        return resultado;

    }
*/
}

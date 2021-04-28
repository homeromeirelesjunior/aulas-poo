
package br.edu.fatecfranca.prova.questao3;

public class Casa extends Imovel {
    private float quintal;

    public Casa() {
    }

    public Casa(float quintal, String endereco) {
        super(endereco);
        this.quintal = quintal;
    }

    public float getQuintal() {
        return quintal;
    }

    public void setQuintal(float quintal) {
        this.quintal = quintal;
    }
   
    @Override
    public String mostra() {
        return "Casa{" + "quintal=" + quintal + '}' + " endereço: " + super.mostra();
    }  
    
}

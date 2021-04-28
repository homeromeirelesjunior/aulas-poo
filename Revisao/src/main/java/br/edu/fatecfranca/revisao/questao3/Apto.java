
package br.edu.fatecfranca.revisao.questao3;

public class Apto extends Imovel {
    private int nro;

    public Apto() {
    }

    public Apto(int nro, String endereco) {
        super(endereco);
        this.nro = nro;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }


    public String mostra() {
        return "Apto{" + "nro=" + nro + '}' + " endereço: " +  super.endereco;
    }       
    
}

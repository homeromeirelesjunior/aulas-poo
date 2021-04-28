package br.edu.fatecfranca.revisao.questao3;

public class Imovel {
    protected String endereco;

    public Imovel() {
    }

    public Imovel(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String mostra() {
        return "Imovel{" + "endereco=" + endereco + '}';
    }
        
}

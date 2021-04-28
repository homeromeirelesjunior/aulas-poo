package br.edu.fatecfranca.l4.abstrata;

// classe não pode ser instanciada
// OBS 1: normalmente é aplicada na classe pai ou super classe
public abstract class Moradia {
    protected String dono, endereco;

    public Moradia() {
    }

    public Moradia(String dono, String endereco) {
        this.setDono(dono);
        this.setEndereco(endereco);
    }

    public String getDono() {
        return dono;
    }

    // se as classes filhas quiserem anular o setDono(), não será possível
    public final void setDono(String dono) {
        this.dono = dono;
    }

    public String getEndereco() {
        return endereco;
    }
    
    // se as classes filhas quiserem anular o setEndereco(), não será possível
    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   
    public String mostra() {
        return "Moradia{" + "dono=" + dono + ", endereco=" + endereco + '}';
    }
    
    // não será implementado aqui, será implementado obrigatoriamente nas filhas
    public abstract String mensagemVenda();
    
}

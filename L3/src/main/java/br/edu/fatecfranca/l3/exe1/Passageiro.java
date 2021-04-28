
package br.edu.fatecfranca.l3.exe1;

public class Passageiro {
    private String nome, rg;

    public Passageiro() {
    }

    public Passageiro(String nome, String rg) {
        this.setNome(nome);
        this.setRg(rg);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public final void setRg(String rg) {
        this.rg = rg;
    }

    public String mostra() {
        return "Passageiro{" + "nome=" + nome + ", rg=" + rg + '}';
    }
    
    
}

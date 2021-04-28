
package br.edu.fatecfranca.l3.exe0;

public class Professor {
    private String nome, cpf, titulacao;

    public Professor() {
    }

    public Professor(String nome, String cpf, String titulacao) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTitulacao(titulacao);
    }      
    
    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public final void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }    

    public String mostra() {
        return "Professor{" + "nome=" + nome + ", cpf=" + cpf + ", titulacao=" + titulacao + '}';
    }
   
    
}

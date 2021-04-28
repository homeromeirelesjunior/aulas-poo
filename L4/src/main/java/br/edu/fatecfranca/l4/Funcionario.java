
package br.edu.fatecfranca.l4;

public class Funcionario {
    // visibilidade protegida, permite as filhas herdarem
    // pública para as filhas e privada paras as demais classes que não estão no mesmo pacote
    protected String nome, cpf;
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, float salario) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }
    
    // - final é para que as classes filhas não reescrevam os métodos setters
    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public final void setSalario(float salario) {
        this.salario = salario;
    }

    
    public String mostra() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
    
}

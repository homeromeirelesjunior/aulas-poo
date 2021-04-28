
package br.edu.fatecfranca.l1.exe01;

public class Aluno {
    // variáveis
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;
    
    // método construtor com parâmetro
    // Aluno obj1 = new Aluno(10, "José", 30, 10, 10)
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    // método construtor sem parâmetro
    // Aluno obj1 = new Aluno()
    public Aluno () {}
    
    // retorna a média
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }
    
    // retorna dados do aluno
    public String dadosAluno() {
        return "Numero do aluno: " + this.numeroAluno + " Nome do aluno: " + this.nome + " Idade do aluno: " + this.idade;
    }
    
    public void passou() {
        if (this.notaFinal() >= 6) {
            System.out.println("Aluno aprovado!");
        }
        else {
            System.out.println("Aluno reprovado");
        }
    }
}

    

package br.edu.fatecfranca.l3.exe2;

public class Aluno {
    private int idade;
    private String nome, numeroAluno;
    private float p1, p2;
    
    public Aluno () {}
    
    public Aluno (String numeroAluno, int idade, String nome, float p1, float p2) {         
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public final void setNumeroAluno(String numeroAluno) {
      if (numeroAluno.length() == 6) {
          this.numeroAluno = numeroAluno;
      }
      else {
          System.out.println("O número de caracteres deve ser igual a 6.");
      }
 }
    
   public final void setIdade(int idade) {
        if (idade >= 16) {
           this.idade = idade;
        }
        else {
            System.out.println("Idade inválida.");
        }
    }
    
    public final void setNome (String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        }
        else {
            System.out.println("Nome não pode ultrapassar 30 caracteres.");
        }
    }
    
    public final void setP1 (float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        }
        else {
            System.out.println("Não é possivel adicionar notas inferior a 0.");
        }
    }
    
    public final void setP2 (float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        }
        else {
            System.out.println("Não é possivel adicionar notas inferior a 0.");
        }
    }
    
    public String getNumeroAluno() {
        return this.numeroAluno;
    }         
            
}

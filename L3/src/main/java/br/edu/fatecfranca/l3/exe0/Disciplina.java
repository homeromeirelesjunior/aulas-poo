
package br.edu.fatecfranca.l3.exe0;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    // associação
    private Professor professor; // Professor é o tipo de objeto e professor é o objeto

    public Disciplina() {
        this.professor = new Professor();       // não dar erro de acesso à memória
    }

    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.setNome(nome);
        this.setCargaHoraria(cargaHoraria);
        this.setProfessor(professor);
    }

    
    
    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public final void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public final void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String mostra() {
        return "Disciplina{" + "nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", professor=" + professor.mostra() + '}';
    }   
    
}

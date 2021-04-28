
package br.edu.fatecfranca.l2.exe0;

public class Paciente {
    // visibilidade é privada - encapsuladas
    private String nome;
    private int idade;
    private float peso, altura;
    
    // Paciente obj1 = new Paciente()
    public Paciente () {}
    
    // Paciente obj2 = new Paciente("Guilherme", 22, 70, 1.70)
    public Paciente (String nome, int idade, float peso, float altura) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setAltura(altura);
    }
    
    // setters
    // final -> método não pode ser alterado pelos filhos
    public final void setNome(String nome) {
        this.nome = nome;
    }
    
    // final -> método não pode ser alterado pelos filhos
    public final void setIdade(int idade) {
        if ((idade >= 0) && (idade <= 130)) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
    
    // final -> método não pode ser alterado pelos filhos
    public final void setPeso(float peso) {
        if ((peso >= 0) && (peso <= 300)) {
            this.peso = peso;
        }
        else {
            System.out.println("Peso inválido.");
        }
    }
    
    // final -> método não pode ser alterado pelos filhos
    public final void setAltura(float altura) {
        if ((altura > 0) && (altura <= 3)) {
            this.altura = altura;
        }
        else {
            System.out.println("Altura inválida.");
        }
    }
    
    // getters
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
    
    public float getPeso() {
        return this.peso;
    }
    
    public float getAltura() {
        return this.altura;
    }
    

    
}

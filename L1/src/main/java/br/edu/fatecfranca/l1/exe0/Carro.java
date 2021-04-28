
package br.edu.fatecfranca.l1.exe0;

// serve de modelo - serve como uma forma - abstrato
public class Carro {
    // declaração das variáveis
    // tipo_variável nome_variável
    String marca;    // String é um tipo de dado e uma classe (minúsculo)
    String modelo;  // String é um tipo de dado e uma classe (minúsculo)
    int ano;        // int é um tipo de dado primitivo (minúsculo) - Integer
    boolean motor;  // boolean é um tipo de dado primitivo (minúsculo) - Boolean
    float velAtual; // float é um tipo de dado primitivo (minúsculo) - Float
    
    // método construtor
    // possui o mesmo nome da classe
    public Carro(int ano, String modelo, String marca, boolean motor, float velAtual){
        // this representa o objeto que chama o método
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.velAtual = velAtual;
    }
    public Carro(){
    }
    
    // void pois o método não retorna nada
    public void mostra(){
        // this represetna o objeto que chama o método
         System.out.println(" Ano: " + this.ano + " Modelo: " + this.modelo + " Marca: " + this.marca + " Motor: " + this.motor + " Velocidade: " + this.velAtual);
    }
    
    public void ligar(){
        this.motor = true;
    }
    
    public void desligar() {
        this.motor = false;
        this.velAtual = 0;
    }
    
    public void acelerar(float x) {
        if (this.motor) { // se o motor estiver ligado
            this.velAtual += x;
        }
        else {
            System.out.println("Carro está desligado");
        }
    }
    
    public void frear (float x) {
        if (this.motor) {   // verifica se o motor está ligado
            if (x <= this.velAtual) {   // verifica se a freagem é menor que a vel atual
                this.velAtual -= this.velAtual ;
            }
            else {
                System.out.println("Carro não pode ter velocidade negativa");
            }
        } 
        else {
            System.out.println("Carro está desligado");
        }
    }
}

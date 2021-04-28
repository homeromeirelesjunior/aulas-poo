
package br.edu.fatecfranca.l1.exe02;

public class Cliente {
    // variaveis
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;


public Cliente (int numeroConta, int numeroAgencia, String nome, float saldo) {
    this.numeroConta = numeroConta;
    this.numeroAgencia = numeroAgencia;
    this.nome = nome;
    this.saldo = saldo;        
}

public Cliente () {}

public void realizarDeposito(float deposito) {
    this.saldo += deposito;
}

public void realizarSaque(float saque) {
    if (this.saldo >= saque) {
        this.saldo -= saque;
    }
    else {
        System.out.println("Saldo insuficiente.");
    }
}

public String dadosCliente() {
    return "Numero da conta: " + this.numeroConta + " Nome do cliente: " + this.nome + " Saldo atual: " + this.saldo;
}

}
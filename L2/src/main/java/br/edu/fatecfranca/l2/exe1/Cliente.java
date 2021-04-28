
package br.edu.fatecfranca.l2.exe1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    public Cliente () {}
    
    public Cliente (String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public final void setNumeroConta(String numeroConta) {
        if ((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')) {
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Conta inválida.");
        }
    }
    
    public final void setNumeroAgencia(String numeroAgencia) {
        if ((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')) {
            this.numeroAgencia = numeroAgencia;
        }
        else {
            System.out.println("Agência inválida.");
        }
    }
    
    public final void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        }
        else {
            System.out.println("O máximo de caracters permitido são 30.");
        }
    }
    
    public final void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta () {
        return this.numeroConta;
    }
    
    public String getNumeroAgencia () {
        return this.numeroAgencia;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
     
    public void getDadosCliente() {
        System.out.println("Numero da conta: " + this.numeroConta + " Numero da agencia: " + this.numeroAgencia + " Nome do cliente: " + this.nome + " Saldo atual: " + this.saldo);
    }
    
    public void realizarDeposito(float deposito) {
        this.setSaldo(this.saldo + deposito);
    }
    
    public void realizarSaque(float saque) {
        this.setSaldo(this.saldo - saque);
    }
    
}

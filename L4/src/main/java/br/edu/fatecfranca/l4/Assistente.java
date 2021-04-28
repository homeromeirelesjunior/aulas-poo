
package br.edu.fatecfranca.l4;

public class Assistente extends Funcionario {
    
    public float auxilioTransporte;
    
    public Assistente() {
        super();
    }

    public Assistente(float auxilioTransporte, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        this.setAuxilioTransporte(auxilioTransporte);
    }    
    
    public float getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public final void setAuxilioTransporte(float auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }
    
    public float calculaSalarioFinal() {
        return this.salario + this.auxilioTransporte;
    }

    @Override
    public String mostra() {
        return "Assistente{" + "auxilioTransporte=" + auxilioTransporte + super.mostra() + "Salário final: " + this.calculaSalarioFinal() + '}';
    }  
        
}

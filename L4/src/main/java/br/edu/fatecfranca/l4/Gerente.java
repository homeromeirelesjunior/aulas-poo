
package br.edu.fatecfranca.l4;

// extends indica herança
public class Gerente extends Funcionario {
    
    private float comissao;
    
    public Gerente () {
        super();    // chama construtor da superclasse
    }

    public Gerente(float comissao, String nome, String cpf, float salario) {
        super(nome, cpf, salario);      // chama construtor da superclasse
        this.setComissao(comissao);
    }
         
    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    public float calculaSalarioFinal() {
        return this.salario + (this.comissao * this.salario) / 100;
    }
    
    @Override // indica que o mostra() da superclasse foi anulado
    public String mostra() {
        return "Gerente{" + "comissao=" + comissao + super.mostra() + "Salário final: " + this.calculaSalarioFinal() + '}';
    }
        
}

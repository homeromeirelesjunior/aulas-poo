
package br.edu.fatecfranca.l4;

public class Diretor extends Funcionario {
    
    private float bonus;
    
    public Diretor () {
        super();
    }

    public Diretor(float bonus, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        this.setBonus(bonus);
    }    
    
    public float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }
    
    public float calculaSalarioFinal() {
        return this.salario + this.bonus;
    }

    @Override
    public String mostra() {
        return "Diretor{" + "bonus=" + bonus + super.mostra() + "Salário final: " + this.calculaSalarioFinal() + '}';
    }  
    
}

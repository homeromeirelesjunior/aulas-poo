
package br.edu.fatecfranca.l1.exe04;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    public Rio () {}
    
    public Rio (String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void ensolarar(float x) {
        if (this.nivel >= x) {
            this.nivel -= x; 
        }
        else {
            System.out.println("Nível do rio não pode ser inferior a 0.");
        }
    }
    
    public void chover(float x) {
        this.nivel += x;
    }
    
    public void sujar() {
        if (!this.poluido) {
            this.poluido = true;    
        }
        else {
            System.out.println("Rio já está poluido.");
        }
    }
    
    public void limpar () {
        if (this.poluido) {
            this.poluido = false;
        }
        else {
            System.out.println("Rio já está limpo.");
        }
    }
    
    public void mostra() {
        System.out.println("Nome: " + this.nome + " Nível: " + this.nivel + " Poluido: " + (this.poluido ? "SIM": "NÃO"));
    }
}

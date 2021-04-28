
package br.edu.fatecfranca.revisao.questao1;

public class Computador {
    private boolean ativo;
    private int ram;

    public Computador() {
    }

    public Computador(boolean ativo, int ram) {
        this.ativo = ativo;
        this.setRam(ram);
    }

    public boolean isAtivo() {
        return ativo;
    }

    public final void setAtivo() {
        if (this.ativo == false) {
            this.ativo = true;
        } else {
            this.ativo = false;
        }
    }
    
    public int getRam() {
        return ram;
    }

    public final void setRam(int ram) {
        if (ram == 4 || ram == 8 || ram == 16 || ram == 32) {
            this.ram = ram;
        } else {
            System.out.println("Valor inválido");
        }
    }

  
    public String mostra() {
        return "Computador{" + "ativo=" + ativo + ", ram=" + ram + '}';
    }      
    
}

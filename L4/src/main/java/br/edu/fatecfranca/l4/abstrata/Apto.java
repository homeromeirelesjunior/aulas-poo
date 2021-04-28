
package br.edu.fatecfranca.l4.abstrata;

public class Apto extends Moradia {
    
    private int andar;
    private boolean sacada;

    public Apto() {
        super();
    }

    public Apto(int andar, boolean sacada, String dono, String endereco) {
        super(dono, endereco);
        this.setAndar(andar);
        this.setSacada(sacada);
    }

    public int getAndar() {
        return andar;
    }

    public final void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isSacada() {
        return sacada;
    }

    public final void setSacada(boolean sacada) {
        this.sacada = sacada;
    }

    @Override
    public String mostra() {
        return "Apto{" + "andar=" + andar + ", sacada=" + sacada + super.mostra() + '}';
    }
    
    @Override
    public String mensagemVenda() {
        return "Apto vendido com sucesso";
    }
}


package br.edu.fatecfranca.l4.abstrata;


public class Casa extends Moradia {
    
    private float tamanhoQuintal;
    private boolean churrasqueira;

    public Casa() {
        super();
    }

    public Casa(float tamanhoQuintal, boolean churrasqueira, String dono, String endereco) {
        super(dono, endereco);  // reutilização
        this.setTamanhoQuintal(tamanhoQuintal);
        this.setChurrasqueira(churrasqueira);
    }

    public float getTamanhoQuintal() {
        return tamanhoQuintal;
    }

    public final void setTamanhoQuintal(float tamanhoQuintal) {
        this.tamanhoQuintal = tamanhoQuintal;
    }

    public boolean isChurrasqueira() {
        return churrasqueira;
    }

    public final void setChurrasqueira(boolean churrasqueira) {
        this.churrasqueira = churrasqueira;
    }

    @Override   // anulamos o mostra() porque não nos serve
    public String mostra() {
        return "Casa{" + "tamanhoQuintal=" + tamanhoQuintal + ", churrasqueira=" + churrasqueira + super.mostra() + '}';    // reutilização
    }
    
    @Override
    public String mensagemVenda() {
        return "Casa vendida com sucesso";
    }
    
}

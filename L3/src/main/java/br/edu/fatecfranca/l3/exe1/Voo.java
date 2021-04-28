
package br.edu.fatecfranca.l3.exe1;

public class Voo {
    
    private int codigo;
    private String origem, destino;

    public Voo() {
    }

    public Voo(int codigo, String origem, String destino) {
        this.setCodigo(codigo);
        this.setOrigem(origem);
        this.setDestino(destino);
    }

    public int getCodigo() {
        return codigo;
    }

    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public final void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public final void setDestino(String destino) {
        this.destino = destino;
    }

    
    public String mostra() {
        return "Voo{" + "codigo=" + codigo + ", origem=" + origem + ", destino=" + destino + '}';
    }
    
    
}

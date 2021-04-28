
package br.edu.fatecfranca.prova.questao2;

public class Unidade {
    private String cidade, estado;

    public Unidade() {
    }

    public Unidade(String cidade, String estado) {
        this.setCidade(cidade);
        this.setEstado(estado);
    }   
    
    public String getCidade() {
        return cidade;
    }

    public final void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public final void setEstado(String estado) {
        this.estado = estado;
    }

    public String mostra() {
        return "Unidade{" + "cidade=" + cidade + ", estado=" + estado + '}';
    }
    
    

}
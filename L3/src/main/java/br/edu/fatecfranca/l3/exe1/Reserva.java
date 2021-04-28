
package br.edu.fatecfranca.l3.exe1;

import java.util.Date;

public class Reserva {
    private int codigo;
    private Date data;
    private float valor;
    // associação
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }
    
    // passageiro e voo já estão criados, mostrando sua independência -> agregação
    public Reserva(int codigo, Date data, float valor, Passageiro passageiro, Voo voo) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setValor(valor);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }  
    
    public int getCodigo() {
        return codigo;
    }

    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public final void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public final void setValor(float valor) {
        this.valor = valor;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public final void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public final void setVoo(Voo voo) {
        this.voo = voo;
    }

   
    public String mostra() {
        return "Reserva{" + "codigo=" + codigo + ", data=" + data + ", valor=" + valor + ", \n passageiro=" + passageiro.mostra() + ", \n voo=" + voo.mostra() + '}';
    }
    
    
    
}

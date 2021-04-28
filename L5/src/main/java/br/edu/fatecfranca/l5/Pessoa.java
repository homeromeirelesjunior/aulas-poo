
package br.edu.fatecfranca.l5;

import java.util.Random;

// implements signifca ter comportamento de
public class Pessoa implements ICidadao, IEleitor {
    
    private String rg, cpf;
    private int titulo;
    private boolean votou;

    @Override
    public String tiraRg() {
       // gera um número aleatório
       Random random = new Random();
       String semente = String.valueOf(random.nextInt(1000)); // gera um número entre 0 e 999
       this.rg = semente;
       return "Rg gerado com sucesso";
    }

    @Override
    public String tiraCpf() {          
       // gera um número aleatório
       Random random = new Random();
       String semente = String.valueOf(random.nextInt(1000)); // gera um número entre 0 e 999
       this.cpf = semente;
       return "CPF gerado com sucesso";
    }

    @Override
    public String tiraTitulo() {
       // gera um número aleatório
       Random random = new Random();
       int semente = random.nextInt(1000); // gera um número entre 0 e 999
       this.titulo = semente;
       return "Titulo gerado com sucesso";
    }

    @Override
    public String votar() {
        this.votou = true;
        return "Votou com sucesso";
    }

    public String mostra() {
        return "Pessoa{" + "rg=" + rg + ", cpf=" + cpf + ", titulo=" + titulo + ", votou=" + votou + '}';
    }
    
    
    
}


package br.edu.fatecfranca.l5;

public class Teste {

    public static void main(String[] args) {
     
        Pessoa obj = new Pessoa();
        
        obj.tiraCpf();
        obj.tiraRg();
        obj.tiraTitulo();
        obj.votar();
        
        System.out.println(obj.mostra());
    }
    
}

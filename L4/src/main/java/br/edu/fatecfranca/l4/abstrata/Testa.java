
package br.edu.fatecfranca.l4.abstrata;

import java.util.ArrayList;

public class Testa {

    public static void main(String[] args) {
        
        //Moradia obj = new Moradia();
        
        ArrayList<Moradia> vetor = new ArrayList();
        vetor.add(new Apto(3, true, "Guilherme", "Chile"));
        vetor.add(new Casa(40, true, "Vanessa", "Franca"));
        vetor.add(new Casa(50, true, "Lucas", "Ribeirão PReto"));
        vetor.add(new Apto(4, true, "Marteleto", "São Paulo"));
        
        for (Moradia obj: vetor) {
            System.out.println(obj.mostra());   // polimorfismo
            System.out.println(obj.mensagemVenda());    // polimorfismo
        }
    }
    
}


package br.edu.fatecfranca.prova.questao3;

public class TestaImovel {

    public static void main(String[] args) {
       
        // Exemplo de Polimorfismo
        
        Imovel obj1 = new Imovel();
        
        obj1.setEndereco("Rua dos Abacaxis, 1060");
        
        obj1 = new Casa(15 , obj1.getEndereco());
        
        System.out.println(obj1.mostra());
        
        obj1 = new Apto(101, obj1.getEndereco());
        
        System.out.println(obj1.mostra());
    }
    
}


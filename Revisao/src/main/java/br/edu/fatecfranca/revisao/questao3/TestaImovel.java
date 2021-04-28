
package br.edu.fatecfranca.revisao.questao3;

public class TestaImovel {

    public static void main(String[] args) {
       
        // Exemplo de Polimorfismo
        
        Imovel obj1 = new Imovel();
        
        obj1.setEndereco("Koitolandia");
        
        obj1 = new Casa(24, obj1.getEndereco());
        
        System.out.println(obj1.mostra());
        
        obj1 = new Apto(2424, obj1.getEndereco());
        
        System.out.println(obj1.mostra());
    }
    
}

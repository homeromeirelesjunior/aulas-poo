
package br.edu.fatecfranca.l4;

import java.util.ArrayList;

public class Testa {
    
    // construtor que recebe um método, um objeto polimórfico como parâmetro
    // obj deve ser um tipo de superclasse
    public static void exemplo(Funcionario obj) {
       
        System.out.println(obj.mostra());
        
    }
    
    public static void main(String[] args) {
        
        Assistente obj1 = new Assistente(250, "João Paulo", "123", 2000);
        
        Diretor obj2 = new Diretor(2000, "Amanda", "456", 3000);
        
        Gerente obj3 = new Gerente(20, "Wanderson", "789", 3000);
        
        exemplo(obj1);   // será executado o método mostra() da classe Assistente (obj = obj1)
        exemplo(obj2);   // será executado o método mostra() da classe Diretor (obj = obj2)      
        exemplo(obj3);   // será executado o método mostra() da classe Gerente (obj = obj3)  
        
        // vamos criar um vetor do tipo Funcionario
        ArrayList<Funcionario> vetor = new ArrayList();
        // vamos adicionar um assistente
        vetor.add(obj1);
        // vamos adicionar um diretor
        vetor.add(obj2);
        // vamos adicionar um gerente
        vetor.add(obj3);
        
        // vamos percorrer o vetor, chamando o método mostra() de cada objeto
        for(Funcionario f: vetor) {
            
            System.out.println(f.mostra());
            
        }
        
    }
    
}

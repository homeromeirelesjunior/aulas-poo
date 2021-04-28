
package br.edu.fatecfranca.l1.exe01;

import br.edu.fatecfranca.l1.exe01.Aluno;

public class TestaAluno {

    public static void main(String[] args) {
        
        Aluno obj1 = new Aluno (1, "Homero", 28, 10, 10);
        Aluno obj2 = new Aluno (2, "Ana Karla", 28, 5, 4);
        
        System.out.println(obj1.dadosAluno());
        obj1.passou();
        
        System.out.println(obj2.dadosAluno());              
        obj2.passou();
    }
    
}

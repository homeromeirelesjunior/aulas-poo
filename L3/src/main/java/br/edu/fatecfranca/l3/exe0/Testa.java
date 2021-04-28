
package br.edu.fatecfranca.l3.exe0;

public class Testa {

    public static void main(String[] args) {
        Professor prof1 = new Professor("Waldir", "123.456.789-01", "Mestrado");
                
        Disciplina disc1 = new Disciplina("ED", 80, prof1);
        
        System.out.println(disc1.mostra());
    }
    
}


package br.edu.fatecfranca.l1.exe04;

import javax.swing.JOptionPane;

public class TestaRio {

    public static void main(String[] args) {
       
        String nome = JOptionPane.showInputDialog("Informe nome do rio");
        Rio obj1 = new Rio(nome, 1.2f, false);
        
        obj1.chover(0.3f);
        obj1.sujar();
        obj1.mostra();
    }
    
}


package br.edu.fatecfranca.l1.exe02;

import br.edu.fatecfranca.l1.exe02.Cliente;

public class TestaCliente {

    public static void main(String[] args) {
        
        Cliente obj1 = new Cliente(1000, 1, "Fulano das Couves", 100);
        Cliente obj2 = new Cliente(2000, 2, "Beltrano dos Fundos", 1000);
        
        obj1.realizarDeposito(100);
        obj1.realizarSaque(300);
        
        obj2.realizarDeposito(100);
        obj2.realizarSaque(600);
        
        System.out.println(obj1.dadosCliente());
        
        System.out.println(obj2.dadosCliente());
    }
    
}


package br.edu.fatecfranca.l2.exe1;

import br.edu.fatecfranca.l2.exe1.Cliente;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        
        obj1.setNumeroConta("1234-3");
        obj1.setNumeroAgencia("12-4") ;
        obj1.setNome("Marcos Aurélio da Silva Oliveira Pádua");
        obj1.setSaldo(1000);
        obj1.realizarSaque(300);
        obj1.getDadosCliente();
        
        Cliente obj2 = new Cliente("123-4", "11-4", "Epaminondas Cairo da Silva Prado", 2000);
        obj2.realizarSaque(1000);
        obj2.realizarDeposito(1000);  
        obj2.getDadosCliente();
       
    }    
}

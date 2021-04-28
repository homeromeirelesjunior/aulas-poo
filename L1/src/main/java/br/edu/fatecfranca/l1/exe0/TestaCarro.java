
package br.edu.fatecfranca.l1.exe0;

import br.edu.fatecfranca.l1.exe0.Carro;

public class TestaCarro {

    public static void main(String[] args) {
        // Vamos instanciar os objetos da classe Carro
        // como criar um objeto
        // tipo_objeto nome_objeto = new tipo_objeto()
        Carro obj1 = new Carro();
        obj1.ano = 2018;
        obj1.modelo = "Onix";
        obj1.marca = "Chevrolet";
        obj1.motor = false;
        obj1.velAtual = 0;
        
        // cria um objeto chamado o método construtor
        Carro obj2 = new Carro(2016, "Palio", "Fiat", true, 50);
        
        Carro obj3 = new Carro(2020, "Gol", "VW", false, 0);

        obj1.mostra();
        obj2.mostra();
        obj3.mostra();
        
        obj1.ligar();
        
        obj1.acelerar(80);
        obj1.frear(30);
        
        obj2.desligar();
        obj2.acelerar(40);
        obj3.ligar();
               
        obj1.mostra();
        obj2.mostra();
        obj3.mostra();
    }
    
}

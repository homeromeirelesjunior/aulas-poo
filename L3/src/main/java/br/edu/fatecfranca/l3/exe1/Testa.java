
package br.edu.fatecfranca.l3.exe1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Testa {

    // o método main lançou uma exceção
    public static void main(String[] args) throws ParseException {
        Passageiro obj1 = new Passageiro("Mateus", "28.456.213-6");
        Voo obj2 = new Voo(111, "São Paulo", "Rio de Janeiro");
        // new Date() -> data atual do sistema
        Reserva obj3 = new Reserva(222, new Date(), 600, obj1, obj2);
        System.out.println(obj3.mostra());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse("12/03/2022");
        
        Reserva obj4 = new Reserva(333, data, 550, obj1, obj2);
        System.out.println(obj4.mostra());
    }
    
}

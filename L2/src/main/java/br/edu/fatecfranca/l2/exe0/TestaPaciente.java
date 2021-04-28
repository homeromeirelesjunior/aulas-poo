
package br.edu.fatecfranca.l2.exe0;

public class TestaPaciente {

    public static void main(String[] args) {
        Paciente obj1 = new Paciente();
        
        obj1.setNome("Pedro");
        obj1.setIdade(-4) ;
        obj1.setPeso(300);
        obj1.setAltura(-30);
        
        System.out.println("Nome: " + obj1.getNome() + " Idade: " + obj1.getIdade() + " Peso: " + obj1.getPeso() + " Altura: " + obj1.getAltura());
        
        Paciente obj2 = new Paciente("Diego", 800, -40, 5);
    }
    
}

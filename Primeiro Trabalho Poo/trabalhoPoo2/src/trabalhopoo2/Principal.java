/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author Victor Yuiti
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Primeiro empregado1 (objeto) "1"
        Empregado empregado1 = new Empregado();
        
        empregado1.setPrimeiroNome("João");
        empregado1.setSobrenome("Silva");
        empregado1.setSalarioMensal(2000.00);
        
        // Segundo empregado2 (objeto) "2"
        Empregado empregado2 = new Empregado();
        
        empregado2.setPrimeiroNome("Maria");
        empregado2.setSobrenome("Santos");
        empregado2.setSalarioMensal(800.00);

        System.out.println("Salário anual do empregado 1: R$" + String.format("%.2f\n", empregado1.salarioAnual()));
        System.out.println("Salário anual do empregado 2: R$" + String.format("%.2f\n", empregado2.salarioAnual()));
        
        // Aumento!
        empregado1.aumento();
        empregado2.aumento();

        System.out.println("Novo salário mensal do empregado 1: " +  empregado1.mostrarInformacoes());
        System.out.println("Novo salário mensal do empregado 2: " +  empregado2.mostrarInformacoes());
    }
    
}

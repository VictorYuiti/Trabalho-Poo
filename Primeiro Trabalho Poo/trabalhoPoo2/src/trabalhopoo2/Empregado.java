/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo2;

/**
 *
 * @author Victor Yuiti
 */
public class Empregado {
    
    
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        
        if (salarioMensal >= 1320){
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 1320;
        }
               
    }
    
    public String mostrarInformacoes(){
        return  "\nNome completo: " + primeiroNome + " " + sobrenome + "\n" +
                "Salario mensal: R$" + String.format("%.2f", salarioMensal) + "\n";
    }
    
    public double salarioAnual(){
        return salarioMensal * 12;
    }
    
    public void aumento(){
        salarioMensal = salarioMensal * 10;
    }
    
    
    
}

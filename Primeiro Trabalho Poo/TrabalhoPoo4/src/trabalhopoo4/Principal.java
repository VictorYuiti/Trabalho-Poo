/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhopoo4;

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
        
        // Primeiro objeto
        Data data1 = new Data();
        data1.setDia(25);
        data1.setMes(03);
        data1.setAno(2023);
        
        System.out.println("Primeira data: " + data1.mostrarData());
        data1.proximoDia();
        System.out.println("Proximo dia: " + data1.mostrarData());
        
        
        // Segundo objeto
        Data data2 = new Data();
        data2.setDia(31);
        data2.setMes(12);
        data2.setAno(2025);
        
        System.out.println("Segunda data: " + data2.mostrarData());
        data2.proximoDia();
        System.out.println("Proximo dia: " + data2.mostrarData());
        
        
        // Terceiro objeto
        Data data3 = new Data();
        data3.setDia(29);
        data3.setMes(02);
        data3.setAno(2024);
        
        System.out.println("Terceira data: " + data3.mostrarData());
        data3.proximoDia();
        System.out.println("Proximo dia: " + data3.mostrarData());
        
    }
    
}

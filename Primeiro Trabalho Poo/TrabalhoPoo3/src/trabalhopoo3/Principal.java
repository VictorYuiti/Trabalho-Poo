/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhopoo3;

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
        
        Complexo complexo1 = new Complexo(3, 5, 2, 4);
        System.out.println("A soma dos numeros complexos 1 e 2 e: " + complexo1.somaComplexo());

        Complexo complexo2 = new Complexo(1, 7, 8, 3);
        System.out.println("A soma dos numeros complexos 1 e 2 e: " + complexo2.somaComplexo());

        Complexo complexo3 = new Complexo(4, 2, 1, 9);
        System.out.println("A soma dos numeros complexos 1 e 2 e: " + complexo3.somaComplexo());
    }
    
}

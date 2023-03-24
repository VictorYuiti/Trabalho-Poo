/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Trabaho 1...

package trabalhopoo;

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
        
        // Primeiro item(objeto) "1"
        Fatura item1 = new Fatura();
        
        item1.setNumeroItem(2);
        item1.setDescricao("Cadeira de madeira");
        item1.setQuantidadeComprada(4);
        item1.setValorUnitario(35.0);
        
        System.out.println("Valor total da fatura: R$" + item1.valorFatura());
        
        // Segundo item(objeto) "2"
        Fatura item2 = new Fatura();
        
        item2.setNumeroItem(4);
        item2.setDescricao("Mesa em L");
        item2.setQuantidadeComprada(-4);
        item2.setValorUnitario(78.9);
        
        System.out.println("Valor total da fatura: R$" + item2.valorFatura());
        
        // Terceiro item(objeto) "3"
        Fatura item3 = new Fatura();
        
        item3.setNumeroItem(5);
        item3.setDescricao("Suporte headset");
        item3.setQuantidadeComprada(3);
        item3.setValorUnitario(3.0);
        
        System.out.println("Valor total da fatura: R$" + item3.valorFatura());
    }
    
}

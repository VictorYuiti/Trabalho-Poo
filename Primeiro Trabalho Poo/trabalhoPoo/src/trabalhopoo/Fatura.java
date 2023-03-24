/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo;

/**
 *
 * @author Victor Yuiti
 */
public class Fatura {
    
    private int numeroItem;
    private String descricao;
    private int quantidadeComprada;
    private double valorUnitario;

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }
    
    // Concatena as informacoes (Basico)
    public String getDescricao() {
        return "Descricao do item " + numeroItem + ": " + descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    // Valida se quantidadeComprada é menor que 0 (ou seja numero negativos) vai adicionar a quantidade o valor 0
    public void setQuantidadeComprada(int quantidadeComprada) {
        
        if (quantidadeComprada < 0){
            this.quantidadeComprada = 0;
        } else {
            this.quantidadeComprada = quantidadeComprada;
        }
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    // Valida se for maior que "5" valorUnitario passa ser "5.00"
    public void setValorUnitario(double valorUnitario) {
        
        if (valorUnitario > 5.00) {
            this.valorUnitario = 5.00;
        } else {
            this.valorUnitario = valorUnitario;
        }
               
    }
    
    // Calcula o valor da fatura, qts * valor unitario
    public double valorFatura(){        
        return (quantidadeComprada * valorUnitario);
    }
    
    
    
}

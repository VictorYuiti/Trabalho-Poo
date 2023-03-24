/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo4;

/**
 *
 * @author Victor Yuiti
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    
    /* Recebe um valor inteiro que representa o dia e verifica se esse valor está entre 1 e 31. 
    Caso esteja, o valor é atribuído ao atributo dia. Caso contrário, é atribuído o valor 0. */
    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 0;
        }
    }
    
    /* recebe um valor inteiro que representa o mês e verifica se esse valor está entre 1 e 12.
    Caso esteja, o valor é atribuído ao atributo mes. Caso contrário, é atribuído o valor 0. */
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 0;
        }
    }
    
    /* Recebe um valor inteiro que representa o ano e verifica se esse valor está entre 2000 e 2025. 
    Caso esteja, o valor é atribuído ao atributo ano. Caso contrário, é atribuído o valor 0. */
    public void setAno(int ano) {
        if (ano >= 2000 && ano <= 2025) {
            this.ano = ano;
        } else {
            this.ano = 0;
        }
    }
    
    // Retorna uma String no formato "dd/mm/aaaa", que representa a data atual.
    public String mostrarData() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
    
    /* Atualiza a data para o dia seguinte. Primeiro, verifica qual é o último dia do mês atual;
    (levando em conta se o ano é bissexto ou não);
    em seguida, verifica se o dia atual é o último dia do mês;
    se for, atualiza o dia para 1 e o mês para o próximo mês;
    se o mês atual for dezembro, atualiza o mês para janeiro e incrementa o ano; 
    caso contrário, apenas incrementa o dia. */
    public void proximoDia() {
        int ultimoDia = 31;
        
        switch (this.mes) {
            case 2:
                ultimoDia = (this.ano % 4 == 0 && (this.ano % 100 != 0 || this.ano % 400 == 0)) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ultimoDia = 30;
                break;
        }
        
        if (this.dia == ultimoDia) {
            if (this.mes == 12) {
                this.dia = 1;
                this.mes = 1;
                this.ano++;
            } else {
                this.dia = 1;
                this.mes++;
            }
        } else {
            this.dia++;
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.frtech.supersomador.core.model;

/**
 *
 * @author Usuario
 */
public class Somador {
    private Integer valor1;
    private Integer valor2;
    
    public int calculoIntervalo(int v1, int v2){
        this.valor1 = v1;
        this.valor2 = v2;
        int soma = getValor1() + getValor2();
        for(int i = getValor1(); i < getValor2()-1; i++){
            soma += i+1;
        }
        return soma;
    }

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }
}

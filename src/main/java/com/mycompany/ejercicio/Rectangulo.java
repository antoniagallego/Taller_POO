/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

/**
 *
 * @author galle
 */
public class Rectangulo {
    protected Punto esquina;
    protected float lado1;
    protected float lado2;

    public Rectangulo(Punto esquina, float lado1, float lado2) {
        this.esquina = esquina;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void imprimir() {
        System.out.print("Esquina: ");
        esquina.imprimir();
        System.out.println("Lado #1: " + lado1 + "; Lado #2: " + lado2);
    }
}

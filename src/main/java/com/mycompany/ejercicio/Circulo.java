/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

/**
 *
 * @author galle
 */
public class Circulo {
    private Punto esquina;
    private float radio;

    public Circulo(Punto esquina, float radio) {
        this.esquina = esquina;
        this.radio = radio;
    }

    public void imprimir() {
        System.out.print("Esquina: ");
        esquina.imprimir();
        System.out.println("Radio: " + radio);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

/**
 *
 * @author galle
 */
public class Cuadrado extends Rectangulo {
    public Cuadrado(Punto esquina, float lado) {
        super(esquina, lado, lado);
    }

    @Override
    public void imprimir() {
        System.out.print("Esquina: ");
        esquina.imprimir();
        System.out.println("Lado: " + lado1);
    }
}

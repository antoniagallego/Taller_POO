/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

/**
 *
 * @author galle
 */
public class Punto {
    protected float x;
    protected float y;
    
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public void imprimir() {
        System.out.println("x=" + x + "; y=" + y);
    }
}

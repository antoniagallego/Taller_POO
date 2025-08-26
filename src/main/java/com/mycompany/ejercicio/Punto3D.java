/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

/**
 *
 * @author galle
 */
public class Punto3D extends Punto{
    private float z;

    public Punto3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void imprimir() {
        System.out.println("x=" + x + "; y=" + y + "; z=" + z);
    }
}

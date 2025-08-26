/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio;

/**
 *
 * @author galle
 */
public class Ejercicio {

    public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(5, 7);
        Punto3D p3 = new Punto3D(1, 2, 3);

        Linea l = new Linea(p1, p2);
        Circulo c = new Circulo(p1, 4.5f);
        Rectangulo r = new Rectangulo(p2, 6, 3);
        Cuadrado sq = new Cuadrado(p1, 4);

        System.out.println("\nPunto");
        p1.imprimir();
        System.out.println("\nPunto3D");
        p3.imprimir();
        System.out.println("\nLinea");
        l.imprimir();
        System.out.println("\nCirculo");
        c.imprimir();
        System.out.println("\nRectangulo");
        r.imprimir();
        System.out.println("\nCuadrado");
        sq.imprimir();
    }
}

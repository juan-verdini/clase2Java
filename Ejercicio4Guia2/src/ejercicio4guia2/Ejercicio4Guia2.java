/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio4Guia2 {
/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        float centi;
        System.out.println("Ingrese una cantidad de grados centigrados");
        centi=leer.nextFloat();
        double fahr=32 + (9*centi/5);
        System.out.println("La temperatura en grados Fahrenheit es " + fahr);
    }
    
}

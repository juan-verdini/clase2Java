/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guía2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio1Guía2 {
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
//El programa deberá después mostrar el resultado de la suma

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer número entero");
        n1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        n2=leer.nextInt();
        int suma=n1+n2;
        System.out.println("La suma de ambos números es " + suma);
                
    }
    
}

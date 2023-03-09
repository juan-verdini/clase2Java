/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PC
 */
public class Ejercicio3Guia2 {
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
  después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String frase;
        System.out.println("Ingrese una frase");
        frase=leer.readLine();
        String minus=frase.toLowerCase();
        String mayus=frase.toUpperCase();
        System.out.println("La frase en minúsculas es " + minus);
        System.out.println("La frase en mayúsculas es " + mayus);
    }
    
}

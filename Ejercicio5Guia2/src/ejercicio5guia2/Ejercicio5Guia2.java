/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio5Guia2 {
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
 el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        int doble;
        int triple;
        double raiz;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        doble=2*num;
        triple=3*num;
        raiz=Math.sqrt(num);
        System.out.println("El doble del número ingresado es " + doble);
        System.out.println("El triple del número ingresado es " + triple);
        System.out.println("La raiz cuadrada del número ingresado es " + raiz);
        
    }
    
}

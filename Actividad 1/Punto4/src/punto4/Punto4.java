/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import java.util.Scanner;

/**
 *
 * @author estiben
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                /*Ejercicio No 15 */
        System.out.println("***Punto 4***");
        int numero;
        double cuadrado, cubo;
        
        System.out.println("Ingrese un número :");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        
        cuadrado =  Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);
        
        System.out.println("Número :" + numero);
        System.out.println("Cuadrado :" + cuadrado);
        System.out.println("Cubo :" + cubo);
        System.out.println();
    }
    
}

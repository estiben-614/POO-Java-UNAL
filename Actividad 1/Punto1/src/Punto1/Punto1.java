/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;


/**
 *
 * @author estiben
 */
public class Punto1 {

    public static void main(String[] args) {
        
        /*Ejercicio No 4 */
        
        System.out.println ("****Punto 1 ****");
        int edadJuan = 9, edadAlberto, edadAna, edadMama;
        
        edadAlberto = ((edadJuan)*(2))/(3);
        edadAna = ((edadJuan)*(4))/(3);
        edadMama = (edadJuan + edadAlberto + edadAna); 
        
        System.out.println("Edad Juan: " + edadJuan);
        System.out.println("Edad Alberto: " + edadAlberto);
        System.out.println("Edad Ana: " + edadAna);
        System.out.println("Edad Mamá: " + edadMama);
        System.out.println();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

/**
 *
 * @author estiben
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***Punto 2***");
        int x=20;
        double suma = 0 , y=40;
        
        suma += x;
        x+= Math.pow(y,2);
        suma += (x/y);
        System.out.println("El valor de la suma es : " + suma);
        System.out.println();
    }
    
}

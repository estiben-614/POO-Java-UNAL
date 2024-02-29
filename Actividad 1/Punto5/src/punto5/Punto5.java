/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

/**
 *
 * @author estiben
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ejercicio No 17 */
        System.out.println("***Punto 5***");
        double radio = 4, area, longitud;
        
        area = Math.PI* (Math.pow(radio, 2));
        longitud = (2 * Math.PI*radio);
        
        System.out.println("Radio Circulo :" + radio);
        System.out.println("Área : " + area);
        System.out.println("Longitud :" + longitud);
        System.out.println();
    }
    
}

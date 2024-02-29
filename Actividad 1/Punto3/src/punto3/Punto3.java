/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author estiben
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ejercicio No 12 */
        System.out.println("***Punto 3***");
        int valorHora = 5000, horasTrabajadas = 48;
        float reteFuente, salarioNeto, salarioBruto;
        
        salarioBruto = valorHora * horasTrabajadas;
        reteFuente = salarioBruto*(0.125f);
        salarioNeto = salarioBruto - reteFuente;
        
        System.out.println("Horas Trabajadas: "+ horasTrabajadas);
        System.out.println("Salario Bruto : "+ salarioBruto);
        System.out.println("Retención en la fuente :" + reteFuente);
        System.out.println("Salario Neto :" + salarioNeto);
        System.out.println();
    }
    
}

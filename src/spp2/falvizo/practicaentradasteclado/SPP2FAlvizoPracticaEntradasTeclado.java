/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.falvizo.practicaentradasteclado;
import java.util.Scanner;

/**
 *
 * @author falvizo
 */
public class SPP2FAlvizoPracticaEntradasTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        Scanner keyboard = new Scanner (System.in);
        String nombre, matricula, carrera;
        int edad;
        
        //Ejecución del programa
        System.out.println("Introduce tu nombre: ");
        nombre = keyboard.nextLine();
        System.out.println("Introduce tu matrícula");
        matricula = keyboard.nextLine();
        System.out.println("Introduce tu carrera");
        carrera = keyboard.nextLine();
        System.out.println("Introduce tu edad");
        edad = keyboard.nextInt();
        
        //Mostramos resultado
        System.out.println("Tus datos son: "+nombre +
                "\n"+ edad +
                "\n"+ matricula +
                "\n"+ carrera);
    }
    
}

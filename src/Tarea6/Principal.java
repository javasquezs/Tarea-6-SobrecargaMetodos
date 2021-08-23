/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea6;

/**
 *
 * @author JAVS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        
        Empleado empleado1 = new Empleado("Jorge", "Vasquez", 25);
        empleado1.mostrarinfo();
        
        Empleado empleado2 = new Empleado("Jorge", "Vasquez", 25,"172345234");
        empleado2.mostrarinfo(80213123);
        

    }

}

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
public class Empleado extends Persona {

    private String dpi;

    public Empleado(String name, String apellido, int edad) {
        super(name, apellido, edad);
    }

    public Empleado(String name, String apellido, int edad, String dpi ) {
        super(name, apellido, edad);
        this.dpi = dpi;
    }


    


    public void mostrarinfo() {
        System.out.println("nombre: " + getName() + " apellido: " + getApellido() + " edad: " + getEdad());

    }

    public void mostrarinfo(int codemp) {
        System.out.println("Codigo Empleado: " + codemp);

    }

}

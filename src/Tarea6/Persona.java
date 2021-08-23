package Tarea6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JAVS
 */
public class Persona {

    private String name;
    private String apellido;
    private int edad;

    public Persona(String name, String apellido, int edad) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

}

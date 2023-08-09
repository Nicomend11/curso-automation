package org.example.clases;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int legajo;
    private boolean estaMatriculado;

    public void Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Estudiante(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public Estudiante() {
        this.nombre = "Pepe";
        this.apellido = "Pepito";
        this.legajo = 123456;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void rendirExamen(String materia) {
        System.out.println("Rendi la Materia: " + materia);
    }
}
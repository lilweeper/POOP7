/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author gaelc
 */
public class Profesor {
    String nombre, apellido, materia;
    int edad;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String materia, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.edad = edad;
    }

    public void ensenar() {
        System.out.println("El profesor esta enseñando " + materia);
    }

    public void tomarAsistencia() {
        System.out.println("El profesor esta tomando asistencia de los estudiantes");
    }

    public void calificar() {
        System.out.println("El profesor esta calificando los examenes");
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", materia='" + materia + '\'' +
                ", edad=" + edad +
                '}';
    }

}


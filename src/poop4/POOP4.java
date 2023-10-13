/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto = new Punto();
        punto.imprimirPunto();
        Punto punto2=new Punto(3,5);
        punto2.imprimirPunto();
        System.out.println(punto);
        System.out.println(punto2);
        
        Perro perro =new Perro("max","chihuahua","negro",15);
        System.out.println(perro);
        
        Coche coche =new Coche("Mazda","2018","rojo","automatico","magna");
        coche.girar(" derecha");
        System.out.println(coche.toString());
        System.out.println(coche);
        
        Alumno alumno =new Alumno("Gael","Cruz","Manilla",19,"320076752");
        alumno.baja();
        System.out.println(alumno.toString());
        System.out.println(alumno);
        
        Profesor profesor = new Profesor("Antonio", "Ayala", "POO", 32);
        System.out.println(profesor.toString());

        profesor.ensenar();
        profesor.tomarAsistencia();
        profesor.calificar();
        
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3.0, 4.0);
        triangulo.mostrarInformacion();
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author gaelc
 */
public class Alumno {
    
     String nombre,apellido_P,apellido_M,noDeCuenta;
     int edad;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido_P, String apellido_M, int edad, String noDeCuenta) {
        this.nombre = nombre;
        this.apellido_P = apellido_P;
        this.apellido_M = apellido_M;
        this.edad = edad;
        this.noDeCuenta = noDeCuenta;
    }
    public void inscribirse(){
         System.out.println("El alumno se inscribio");
    }
    
    public void aprobar(){
        System.out.println("El alumno aprobo");
      
    }
    
    public void reprobar(){
        System.out.println("Reprobo");
      
    }
    
    public void baja(){
        System.out.println("Dado de baja");
      
    }
    
    public void asistencia(){
        System.out.println("El alumno asistio");
      
    }

        @Override
        public String toString() {
            return "Alumno{" + "Nombre=" + nombre + ", Apellido Paterno=" + apellido_P + ", Apellido Materno=" + apellido_M + ", edad=" + edad + ", no de cuenta=" + noDeCuenta + '}';
        }

    
}

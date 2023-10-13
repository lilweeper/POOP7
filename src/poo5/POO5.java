/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo5;

/**
 *
 * @author poo08alu26
 */
public class POO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno =new Alumno();
        alumno.setNombre("Uriel");
        alumno.setApellido("Jimenez");
        alumno.setCarrera("Narcologia");
        alumno.setEscuela("VirusAntrax");
        Fecha fecha=new Fecha(07,11,2004);
        Alumno alumno2=new Alumno("Kevin","El0711","Narcologia","VirusAntrax",4,fecha);
        String var=alumno.toString();
        System.out.println(var);
        System.out.println(alumno.toString());
        System.out.println(alumno2);
    }
    
}

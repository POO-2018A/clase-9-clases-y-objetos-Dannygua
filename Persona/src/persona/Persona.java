/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Date;

/**
 *
 * @author chalosalvador
 */
public class Persona {

    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
      
    public Persona() {
        this.nombre = "Anónimo";
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Persona(String nombre, String apellido, Date fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        System.out.println("El nombre de p es: " + p.nombre);
        
        p.nombre = "Carlos";
        p.apellido = "Salvador";
        p.fechaNacimiento = new Date("1986/05/03");
        System.out.println("El nombre de p es: " + p.nombre);
        
       
        Persona p1 = new Persona("Chalo");
        System.out.println("El nombre de p1 es: " + p1.nombre);
        System.out.println("El nombre de p es: " + p.nombre);
        
        p.nombre = p.nombre + " Juan";
        System.out.println("El nombre de p es: " + p.nombre);
    }
    
}


package archivo;

import java.util.Date;


public class Archivo {

     private String nombre;
     private String Fechadecreacion;
     private int tamaño;
     private String tipo;
     private String contenido;

    public Archivo(String nombre, String Fechadecreacion, int tamaño, String tipo, String contenido) {
        this.nombre = nombre;
        this.Fechadecreacion = Fechadecreacion;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.contenido = contenido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechadecreacion() {
        return this.Fechadecreacion;
    }

    public void setFechadecreacion(String Fechadecreacion) {
        this.Fechadecreacion = Fechadecreacion;
    }

    public int getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public void mostrar (){
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de creacion: "+Fechadecreacion);
        System.out.println("Tamano: "+tamaño);
        System.out.println("Tipo: "+tipo);
        System.out.println("Contenido: "+contenido);
        
        
    }
     
     
}

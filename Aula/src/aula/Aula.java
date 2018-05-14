
package aula;


public class Aula {

 private String nombre ;
 private String apellido ;
 private String numerocedula;
 private String [] materias;


    public Aula(String nombre, String apellido, String numerocedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerocedula = numerocedula;
        
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumerocedula() {
        return numerocedula;
    }

    public void setNumerocedula(String Numerocedula) {
        this.numerocedula = Numerocedula;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

}

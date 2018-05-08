
package estudiantes;


public class Estudiantes {

   private String nombre,apellido,cedula,fechadenacimiento,materias;

    public Estudiantes() {
        
    }
    
  
    public Estudiantes(String nombre, String apellido, String cedula, String fechadenacimiento, String materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechadenacimiento = fechadenacimiento;
        this.materias = materias;
    }

    public Estudiantes(String materias) {
        this.materias = materias;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }
     
     
    
}

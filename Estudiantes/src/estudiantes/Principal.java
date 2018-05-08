
package estudiantes;

import java.util.Scanner;

public class Principal {
    
    
    public static void main(String[] args) {
        
        Scanner variable = new Scanner (System.in);
        
        Estudiantes objeto = new Estudiantes ();
        
        String nombre,apellido,cedula,fechadenacimiento,materias;
        int matematicas,filosofia,fisica;
        
        System.out.println("Ingrese el numero de estudiantes:");
        int numeroestudiantes = variable.nextInt();
        
        Estudiantes estudiante []= new Estudiantes [numeroestudiantes];
        
        System.out.println("\n");
        System.out.println("materias ha escoger: Filosofia, Matematicas, Fisica \n");
        
        for (int i = 0; i < numeroestudiantes; i++) {
            
            variable.nextLine();
            System.out.println("ingrese el nombre:");
            nombre = variable.nextLine();
            System.out.println("ingrese el apellido:");
            apellido = variable.nextLine();
            System.out.println("ingrese la cedula:");
            cedula = variable.nextLine();
            System.out.println("ingrese la fecha de nacimiento :");
            fechadenacimiento = variable.nextLine();
            System.out.println("ingrese las materias:");
            materias = variable.nextLine();
            
            
            estudiante [i]= new Estudiantes(nombre,apellido,cedula,fechadenacimiento,materias);
            
            
        }
        
        System.out.println("Estudiantes \n");
        
        for (int i = 0; i < numeroestudiantes; i++) {
            
            
            if ("Matematicas".equals(estudiante [i].getMaterias())){
                System.out.println("Estudiantes que estudian Matematicas \n");
                
                System.out.println("Nombre: "+estudiante[i].getNombre());
                System.out.println("Apellido: "+estudiante[i].getApellido());
                System.out.println("Cedula: "+estudiante[i].getCedula());
                System.out.println("Fecha de nacimiento: "+estudiante[i].getFechadenacimiento());
                System.out.println("Materias: "+estudiante[i].getMaterias());
                System.out.println("\n");
            }else if ("Filosofia".equals(estudiante [i].getMaterias())){
                System.out.println("Estudiantes que estudian Filosofia \n");
                
                System.out.println("Nombre: "+estudiante[i].getNombre());
                System.out.println("Apellido: "+estudiante[i].getApellido());
                System.out.println("Cedula: "+estudiante[i].getCedula());
                System.out.println("Fecha de nacimiento: "+estudiante[i].getFechadenacimiento());
                System.out.println("Materias: "+estudiante[i].getMaterias());
                System.out.println("\n");
            }else if ("Fisica".equals(estudiante [i].getMaterias())){
                System.out.println("Estudiantes que estudian Fisica \n");
                
                System.out.println("Nombre: "+estudiante[i].getNombre());
                System.out.println("Apellido: "+estudiante[i].getApellido());
                System.out.println("Cedula: "+estudiante[i].getCedula());
                System.out.println("Fecha de nacimiento: "+estudiante[i].getFechadenacimiento());
                System.out.println("Materias: "+estudiante[i].getMaterias());
                System.out.println("\n");
            }
   
        }
        
        }
        
        
        
        
        
        
    }
    


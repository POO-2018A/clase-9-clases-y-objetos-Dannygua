
package aula;


public class Principal {
    
    public static void main(String[] args) {
        
 
        Aula estudiantes [] = new Aula [3];
        
        String [] contar;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        
      
            estudiantes [0]= new Aula ("Danny","Guanuna","1722631676");
            String [] m = {"m1","m2"};
            estudiantes [0].setMaterias(m);
            estudiantes [1]= new Aula("Juan","Varconez","1722645676");
            String [] m2 = {"m2","m3","m4"};
            estudiantes [1].setMaterias(m2);
            
            estudiantes [2]= new Aula ("David","Jiron","1722631676");
            String [] m3 = {"m2","m3","m4","m5"};
            estudiantes [2].setMaterias(m3);
   
           
            for (int i = 0; i < estudiantes.length; i++) {
                
                System.out.println("\n");
                System.out.println("Estudiante "+(i+1)+"\n");
                System.out.println("Nombre : "+ estudiantes [i].getNombre());
                System.out.println("Apellido : "+ estudiantes [i].getApellido());
                System.out.println("Numero de cedula : "+ estudiantes [i].getNumerocedula());
                
                String [] me = estudiantes[i].getMaterias();
                for (int j = 0; j < me.length; j++) {
                    
                    System.out.println(me[j]);
                    
                    if ("m1".equals(me [j])){
                        n1 ++;
                        
                    }
                    if ("m2".equals(me [j])){
                        n2 ++;
                        
                    }
                    if ("m3".equals(me [j])){
                        n3 ++;
                        
                    }
                    if ("m4".equals(me [j])){
                        n4 ++;
                        
                    }
                    if ("m5".equals(me [j])){
                        n5 ++;
                        
                    }
                    
                }
                
             
        }     
            System.out.println("\n");
            System.out.println("Materias \n");
            System.out.println("m1: "+n1);
            System.out.println("m2: "+n2);
            System.out.println("m3: "+n3);
            System.out.println("m4: "+n4);
            System.out.println("m5: "+n5);
           
                
            
    
    }
}

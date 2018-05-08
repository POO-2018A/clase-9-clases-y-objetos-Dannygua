package cedula_;


public class Cedula_ {

    private boolean verificador = false;
    private int numero;
    private int sum =0;
    private int i ;

    public void verificar (int matriz []){
        
        int contador =0;
        int resultado;
        int denominadormayor;
     
        for(int j=1;j<=9;j++){
             
            if(j%2==1){                  
                numero = matriz[contador]*2; 
                if(numero >=10){
                    numero = numero-9;
                    
                   
                }
                
            }else{
                numero = matriz[contador]*1; 
                if(numero >=10){
                    numero = numero-9;
                }
            }
            
            sum = sum +numero;
            contador++;
            
        }
        
        while (verificador == false){
            
            if (sum < i){  
                verificador =true;
                
               i = i-10;
            }  
            
             i = i+10;
            
        }
   
       resultado =  i-sum;
       
        if (resultado == matriz [9]){
            System.out.println("La cedula si existe ");
        }else{
            System.out.println("La cedula no existe ");
        }
        
    }
    
    public static void main(String[] args) {
        
        Cedula_ objeto = new Cedula_ ();
        
        int matriz []= new int [10];
        
        //aqui se puede cambiar los numeros de la cedula 
        
        matriz [0] = 1;
        matriz [1] = 7;
        matriz [2] = 2;
        matriz [3] = 2;
        matriz [4] = 6;
        matriz [5] = 3;
        matriz [6] = 1;
        matriz [7] = 6;
        matriz [8] = 7;
        matriz [9] = 6;
        
        objeto.verificar(matriz);
        
    }
 
    
}

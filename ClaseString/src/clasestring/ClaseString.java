/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestring;

/**
 *
 * @author chalosalvador
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prueba = "La palabra está en la posición 3";
        
        System.out.println(prueba.toUpperCase());
        System.out.println(prueba.toLowerCase());
        System.out.println(prueba.replace('a', 'x').replace('á', 'x'));
        
        System.out.println(prueba.replaceFirst("a", "x"));
        System.out.println(prueba.indexOf("alab"));
        System.out.println(prueba.substring(16,30));
        
    }
    
}

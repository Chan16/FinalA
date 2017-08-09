/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import  java.util.Scanner;       
/**
 *
 * @author estudiante
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.print("Nombre:");
        System.out.print("ANTHONY EDUARDO CHAN TOLEDO");
        
        System.out.print("Grado:");
        System.out.print("5to Baco A");
        
        String Nombre = "Nombre";
        String Edad = "Edad";
        
        System.out.print("Ingrese El Nombre");
        Scanner N1 = new Scanner(System.in);
        Nombre=N1.nextLine();
        
         System.out.print("Ingrese El EDAD");
        Scanner E1 = new Scanner(System.in);
        Edad=E1.nextLine();
        
        if (18<=Edad) {
            System.out.print("ES MAYOR DE EDAD");
        }else{  
        System.out.print("ES MENOR DE EDAD");
             
        }
        
        
        int A = 16; 
        int B = 16;
       
        System.out.print("Ingrese El Valor A");
        
                   
               
        
        
  }
    
}

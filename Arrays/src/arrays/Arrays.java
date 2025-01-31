
package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
         
       //declaracion
        int vector [] = new int [4];
       //asignacion manual
       vector [0] = 2;
       vector [1] = 32;
       vector [2] = 50;      
       vector [3] = 10;
       
       //asignacion dada por el usuario
       Scanner teclado = new Scanner (System.in);
       for (int i =0; i<vector.length ; i++){
           System.out.println("Ingrese el valor para el indice");
           vector[i] = teclado.nextInt();
       }     
          
       //recorrido
       int i;
       for( i =0; i<vector.length ; i++){
           System.out.println("Estoy en el indice: "+ i);
           System.out.println("Tengo guardado un vector: "+ vector[i]);
           System.out.println("----------------------------");
       }
          
       
    }    
}
   


package ejerciciovector1;

import java.util.Scanner;

public class EjercicioVector1 {

    public static void main(String[] args) {
         String vector [] = new String[8];
       
       Scanner teclado= new Scanner(System.in);
       
       for(int i=0; i<vector.length; i++){
           System.out.println("Ingrese el nombre que quiera guardar en el indice: "+i);
       vector[i]= teclado.nextLine();     
       }
       
       for(int i=0; i<vector.length; i++){
           System.out.println("Indice: "+i +" Nombre guardado: "+ vector[i]);
       }
    }
    
}

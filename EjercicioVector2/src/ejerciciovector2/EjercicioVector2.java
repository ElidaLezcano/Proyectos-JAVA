
package ejerciciovector2;

import java.util.Scanner;

public class EjercicioVector2 {

    public static void main(String[] args) {
        
        /*Realizar un programa que permita la carga de 10 numeros en un vector.
        Una vez cargados el programa debe indicar cual es el mayor y el menor de ellos.
        */
        
        int numeros []= new int [10];
        
        Scanner teclado = new Scanner (System.in);
        for(int i=0; i<numeros.length; i++){
            System.out.println("Ingrese el numero que quiere cargar en la posicion: "+i);
            numeros[i]= teclado.nextInt();
        }
        
         
         
        int menor= Integer.MAX_VALUE;
        for(int i=0; i<numeros.length; i++){          
           if(numeros[i]<menor){
               menor= numeros[i];
           }
        }
        
        
         int mayor= Integer.MIN_VALUE;
         for(int i=0; i<numeros.length; i++){         
           if(numeros[i]>mayor){
               mayor= numeros[i];
           }
        }
        
         System.out.println("El numero menor que ingresó es: "+ menor);
         System.out.println("El numero mayor que ingresó es: "+ mayor);
    }
    
}

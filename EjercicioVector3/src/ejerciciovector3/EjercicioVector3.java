
package ejerciciovector3;

import java.util.Scanner;

public class EjercicioVector3 {

    public static void main(String[] args) {
       
        int numeros []= new int [15];
        
        Scanner teclado= new Scanner (System.in);
        
        //CARGAR 15 NUMEROS
        for(int i=0; i<15; i++ ){
            System.out.println("Ingrese el numero para el indice "+i);
            numeros[i]= teclado.nextInt();
        }
        
        //CONTAR CUANTOS NUMEROS 3 HAY
        int cont3=0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] == 3 || numeros[i] == -3){
               cont3++; 
            }
        }
        
        System.out.println("La cantidad de numeros 3 que hay es: "+cont3);
    }
    
}

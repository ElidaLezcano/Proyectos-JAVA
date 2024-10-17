
package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        //declaracion
      int matriz [][]= new int [3][3];
       //asignacion manual
       matriz [0][0]=1;
       matriz [0][1]=13;
       matriz [0][2]=20;
       matriz [1][0]=54;
       matriz [1][1]=82;
       matriz [1][2]=39;
       matriz [2][0]=25;
       matriz [2][1]=42;
       matriz [2][2]=23;
       
       for(int f=0; f<3; f++){
           for(int c=0; c<3; c++){
               System.out.println("El valor de la posicion f es: "+ f + "c: "+ c);
               System.out.println("Es de: "+ matriz[f][c]);
           }
           
       }
       
      int vector [] = new int [15];
      Scanner teclado = new Scanner(System.in);
        
        for(int i= 0; i<15; i++){
            System.out.println("Ingrese un numero");
           vector[i] =teclado.nextInt();   
        }
        int cont= 0;
          for(int i=0; i<15; i++){
              if(vector[i] == 3){
               cont++;   
              }
          }
        System.out.println("La cantidad de numeros 3 que hay en el vectores es: "+cont);
    }
    
}

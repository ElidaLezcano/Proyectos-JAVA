
package ejerciciovector4;

import java.util.Scanner;

public class EjercicioVector4 {

    public static void main(String[] args) {
      /*Un empleado necesita almacenar sus 12 sueldos del año. Necesita un 
        programa que determine y sume el total de los 12 sueldos y el promedio
        de sueldo que tuvo en el año*/
        
      double sueldos []= new double [12];
      
      //Carga de sueldos
      Scanner teclado= new Scanner(System.in);
        for(int i=0; i<sueldos.length; i++){
            System.out.println("Ingrese el sueldo del mes de: "+ (i+1));
            sueldos[i]=teclado.nextDouble();    
        }
        
      //Suma de sueldos
      double suma=0;
      for(int i=0; i<sueldos.length; i++){
          suma=suma+sueldos[i];
      }
        
      //Promedio de los sueldos
      double promedio;
      promedio= suma/sueldos.length;
      
        System.out.println("La suma de todos los sueldos del año son: "+ suma + "dólares");
        System.out.println("El promedio de los sueldos es de: "+ promedio);
    }
    
}

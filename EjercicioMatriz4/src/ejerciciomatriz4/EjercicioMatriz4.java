
package ejerciciomatriz4;

import java.util.Scanner;

public class EjercicioMatriz4 {

    public static void main(String[] args) {
      /* En la tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundaria.
        Cada fila corresponde a las notas de cada alumno.
        
        Se necesita un programa que permita al profesor cargar en las 3 primeras posiciones de cada
        fila las notas del alumno, y que en un vector diferente se calcule el promedio. */
        
      double notas [][]= new double [4][3];
      double promedios[] = new double[4];
      
      //Carga de las notas en la matriz
      Scanner teclado = new Scanner(System.in);
      for(int f=0; f<notas.length; f++){ 
        System.out.println("Ingrese las 3 notas del alumno "+ (f+1)); 
          for(int c=0; c<notas[0].length; c++){            
                notas[f][c]= teclado.nextDouble();
          }
      }
        System.out.println("-----------PROMEDIOS-----------");
      
      //Calcular promedios
      double total;
      
      for(int f=0; f<notas.length; f++){
          total =0;
          for(int c=0; c<notas[0].length; c++){
              total= total + notas[f][c];
          }
          promedios[f]= total / notas[0].length;
         
      }
        
      //Mostrar notas y promedio
      
       for(int f=0; f<notas.length; f++){
            System.out.println("Las notas del alumno " +(f+1) +" son:");
          for(int c=0; c<notas[0].length; c++){
              System.out.println(notas[f][c]);
          }
           System.out.println("El promedio fue de: "+ promedios[f]);
            System.out.println("----------------------------------");
       }
    }
    
}

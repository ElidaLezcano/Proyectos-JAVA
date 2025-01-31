
package englishschool;

import java.util.Scanner;


public class EnglishSchool {

    public static void main(String[] args) {
       System.out.println("*****BIENVENIDOS A ENGLISH SCHOOL*****");
       
       Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad del alumno");
        int edad = teclado.nextInt();
        if (edad >= 4 && edad <= 6) {
            System.out.println("El horario del Kinder es Lunes y Miercoles de 16 a 17hs.");
        } else {
            if (edad >= 7 && edad <= 8) {
                System.out.println("El horario de 1st year, es Martes y Jueves de 16:30 a 17:30hs.");
            } else {
                if (edad >= 9 && edad <= 10) {
                    System.out.println("El horario de 2nd year, es Martes y Jueves de 17:30 a 19hs.");
                } else {
                    if (edad >= 11 && edad <= 13) {
                        System.out.println("El horario de 3rd year, es Lunes y Miercoles de 17 a 18:30hs.");
                    }
                    else{
                        System.out.println("La edad ingresada es incorrecta");
                    }
                }
            }
        }
        
        
        
    }
    
}


package ejercicios;

import java.util.Scanner;


public class Ejercicios {

    public static void main(String[] args) {
       
         
    
            //nombre
            System.out.println("Ingrese su nombre");
            Scanner teclado = new Scanner(System.in);
           String  nombre= teclado.next();
            //dni
            System.out.println("Ingrese su dni");
            String dni= teclado.next();
            //edad
            System.out.println("Ingrese su edad");
            Scanner teclado2 = new Scanner(System.in);
           int edad= teclado2.nextInt();
            
            while ((!dni.equals("0")) && (!nombre.equalsIgnoreCase("fin"))) ;{
        if (edad >=6 && edad<= 10 ){
            System.out.println("Categoria A");
        }
        else{
            if(edad >=11 && edad<= 17 ){
                System.out.println("Categoria B");
            }
            else{
                if(edad >=18 && edad <=30){
                    System.out.println("Juveniles");
                }
                else{
                    if(edad >=31 && edad <=50){
                        System.out.println("Adultos");
                    }
                    else{
                    if(edad >=51 ){
                        System.out.println("La categoria no corresponde");
                    }
                     
                    }
                }
            }
                
            }
        System.out.println("Ingrese su nombre");
        nombre= teclado.next();
        System.out.println("Ingrese su dni");
        dni= teclado.next();
        
        }
        
    }
    
}

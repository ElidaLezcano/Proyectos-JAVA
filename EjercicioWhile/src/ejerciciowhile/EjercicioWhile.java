
package ejerciciowhile;

import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
        
        //Ejemplo de bucle controlado por contador
        
       /* int contador=0;
        while(contador<10){
            System.out.println("Estoy en la vuelta n°: "+contador);
            contador++;
        }*/
        
       
       
       
       
       
        //Ejemplo de bucle controlado por centinela
       /* boolean bandera= true;
        String respuesta;
        Scanner teclado= new Scanner(System.in);
        
        while(bandera==true){
            System.out.println("El valor de mi bandera es: "+bandera);   
             System.out.println("¿Estas actualmente suscrito? "+bandera);
             
         
        System.out.println("¿Queres desuscribirte de la membresia?");
       respuesta= teclado.next();
       if(respuesta.equalsIgnoreCase("si")){
           bandera =false;
             
        }
      
       }*/
       
       
       
       
       
       //EJERCICIO 3
       
       String palabra;
       Scanner teclado= new Scanner (System.in);
       System.out.println("Ingrese una palabra");
            palabra =teclado.nextLine();
       
           while(!palabra.equalsIgnoreCase("salir")){
                    
           System.out.println(palabra);
          
           System.out.println("Ingrese una palabra");
            palabra =teclado.nextLine();
       }
        System.out.println("¡Gracias por usar nuestro programa!");
    }
    
}

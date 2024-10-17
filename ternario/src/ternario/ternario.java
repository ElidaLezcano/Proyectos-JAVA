
package ternario;

import java.util.Scanner;

public class ternario {
    
    public static void main(String[] args) {
        Double promedio;
        String resultadoFinal;
        
        System.out.println("Ingrese su promedio");
        
        Scanner teclado = new Scanner(System.in);
        promedio= teclado.nextDouble();
        
        resultadoFinal= promedio >=6 ? "Aprobado": "Desaprobado";
        System.out.println("La condicion final del alumno es:"+resultadoFinal);
    }
    
}

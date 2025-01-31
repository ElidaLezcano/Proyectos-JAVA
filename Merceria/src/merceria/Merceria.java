
package merceria;

import java.util.Scanner;

public class Merceria {

    public static void main(String[] args) {
        int paquetes;
        double montoTotal, diferencia, descuento, totalConDesc;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de paquetes de su compra");
        paquetes = teclado.nextInt();

        if (paquetes < 5) {
            if (paquetes < 0) {
                System.out.println("No se permiten compras con cantidad de paquetes negativos");
            } else {
                System.out.println("No se permiten compras menores a 5 paquetes");
            }
        } else {

            System.out.println("¿Cual es el precio de su compra?");
            teclado = new Scanner(System.in);
            montoTotal = teclado.nextDouble();

            if (paquetes >= 5 && paquetes <= 15) {
                System.out.println("El costo de envío es de $10 USD");
                montoTotal = montoTotal + 10;
            } else {
                System.out.println("El envío de su compra es gratuito");
            }

            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 1oo por lo que no posee promociones, "
                        + "necesita " + diferencia + " $ para poder acceder a la promoción");
            } else {

                if (montoTotal >= 100 && montoTotal <= 300) {
                    descuento = montoTotal * 0.05;
                    totalConDesc = montoTotal - descuento;
                    System.out.println("Tiene un descuento del 5%, que equivale a: " + descuento + "$,"
                            + " el monto final con descuento incluido es: " + totalConDesc + " $");
                } else {
                    descuento = montoTotal * 0.10;
                    totalConDesc = montoTotal - descuento;
                    System.out.println("Tiene un descuento del 10%, que equivale a: " + descuento + " $, el"
                            + " monto final con descuento incluido es: " + totalConDesc + " $");

                }
            }

        }
    }

}

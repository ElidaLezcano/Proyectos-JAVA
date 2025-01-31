
package estacionamiento;

import java.util.Scanner;

public class Estacionamiento {

    public static void main(String[] args) {

        String patente = "";
        int tipoServicio, cantHoras, cont1 = 0, cont2 = 0, cont3 = 0;
        double total, totalDia = 0;

        Scanner teclado = new Scanner(System.in);

        while (!patente.equalsIgnoreCase("fin")) {

            System.out.println("Ingrese la patente del vehiculo");
            patente = teclado.nextLine();

            if (!patente.equalsIgnoreCase("fin")) {

                System.out.println("Ingrese el tipo de servicio");
                System.out.println("1- Por hora");
                System.out.println("2- Media Jornada (5 horas)");
                System.out.println("3- Jornada Completa (10 horas)");

                teclado = new Scanner(System.in);
                tipoServicio = teclado.nextInt();

                if (tipoServicio <= 0 || tipoServicio > 3) {
                    System.out.println("No ingresó un tipo de servicio válido");
                } else {
                    if (tipoServicio == 1) {
                        System.out.println("Ingrese la cantidad de horas que desea estacionar");
                        cantHoras = teclado.nextInt();
                        total = cantHoras * 3;
                        System.out.println("El valor total del estacionamiento es de: $" + total + " USD");
                        cont1 = cont1 + 1;
                        totalDia = totalDia + total;

                    } else {
                        if (tipoServicio == 2) {
                            System.out.println("La media jornada (5 horas) posee 5% de descuento");
                            total = 15 - (15 * 0.05);
                            System.out.println("El valor total del estacionamiento es de:" + total);
                            cont2 = cont2 + 1;
                            totalDia = totalDia + total;

                        } else {
                            System.out.println("La jornada completa (10 horas) posee 10% de descuento");
                            total = 30 - (30 * 0.10);
                            System.out.println("El valor total del estacionamiento es de:" + total);
                            cont3 = cont3 + 1;
                            totalDia = totalDia + total;

                        }
                    }
                    System.out.println("***¡MUCHAS GRACIAS POR SU COMPRA!***");
                }

                teclado = new Scanner(System.in);

            }
        }
        System.out.println("-------------------------------------------------\n");
        System.out.println("Totales monetarios del dia");
        System.out.println("Cantidad de servicios por Hora: " + cont1);
        System.out.println("Cantidad de servicios por Media Jornada: " + cont2);
        System.out.println("Cantidad de servicios por Jornada Completa: " + cont3);
        System.out.println("El monto total recaudado del dia es de: " + totalDia + " USD");
    }

}

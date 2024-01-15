package org.example;

public class Main {
    public static void main(String[] args) {
        import java.util.Scanner;


        Scanner scanner = new Scanner(System.in);

                System.out.println("Bienvenido a la calculadora de consumo de combustible");
                System.out.println("Ingrese la distancia total del viaje en kilómetros: ");
                double distanciaViaje = scanner.nextDouble();

                System.out.println("Ingrese el consumo de combustible del carro (litros por cada 100 km): ");
                double consumoCombustible = scanner.nextDouble();

                System.out.println("Ingrese el precio por litro de combustible: ");
                double precioCombustible = scanner.nextDouble();


                double totalLitrosCombustible = (distanciaViaje / 100) * consumoCombustible;
                double costoTotalCombustible = totalLitrosCombustible * precioCombustible;


                System.out.println("Resumen del viaje:");
                System.out.println("Distancia total del viaje: " + distanciaViaje + " km");
                System.out.println("Consumo de combustible: " + consumoCombustible + " litros por cada 100 km");
                System.out.println("Precio por litro de combustible: $" + precioCombustible);
                System.out.println("Consumo total de combustible: " + totalLitrosCombustible + " litros");
                System.out.println("Costo total de combustible: $" + costoTotalCombustible);

    }
}
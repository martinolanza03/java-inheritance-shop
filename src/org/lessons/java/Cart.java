package org.lessons.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();
        boolean checkCicle = true;

        while (checkCicle) {
            System.out.println("\nScegli il numero di prodotto:");
            System.out.println("1. Smartphone");
            System.out.println("2. Television");
            System.out.println("3. Headphone");
            System.out.println("4. Termina");

            int selectedProduct = scanner.nextInt();
            scanner.nextLine();

            if (selectedProduct == 1) {
                System.out.println("Inserisci nome dello Smartphone: ");
                String name = scanner.nextLine();

                System.out.println("Inserisci il nome del Brand: ");
                String brand = scanner.nextLine();

                System.out.println("Inserisci il prezzo: ");
                BigDecimal price = scanner.nextBigDecimal();
                scanner.nextLine();

                System.out.println("Inserisci la memoria: ");
                int memory = scanner.nextInt();
                scanner.nextLine();

                cart.add(new Smartphone(name, brand, price, memory));
            } else if (selectedProduct == 2) {
                System.out.println("Inserisci nome della Televisione: ");
                String name = scanner.nextLine();

                System.out.println("Inserisci il nome del Brand: ");
                String brand = scanner.nextLine();

                System.out.println("Inserisci il prezzo: ");
                BigDecimal price = scanner.nextBigDecimal();
                scanner.nextLine();

                System.out.println("Inserisci i pollici: ");
                float inch = scanner.nextFloat();
                scanner.nextLine();

                System.out.println("Inserisci se è smart: ");
                boolean smart = scanner.nextBoolean();
                scanner.nextLine();

                cart.add(new Television(name, brand, price, inch, smart));
            } else if (selectedProduct == 3) {
                System.out.println("Inserisci nome delle cuffie: ");
                String name = scanner.nextLine();

                System.out.println("Inserisci il nome del Brand: ");
                String brand = scanner.nextLine();

                System.out.println("Inserisci il prezzo: ");
                BigDecimal price = scanner.nextBigDecimal();
                scanner.nextLine();

                System.out.println("Inserisci il colore: ");
                String color = scanner.nextLine();

                System.out.println("Inserisci se è Wireless");
                boolean wireless = scanner.nextBoolean();
                scanner.nextLine();

                cart.add(new Headphone(name, brand, price, color, wireless));
            } else if (selectedProduct == 4) {
                checkCicle = false;
            }
        }

        for (Product product : cart) {
            System.out.println(product.toString());
        }

        scanner.close();
    }
}

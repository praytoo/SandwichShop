package com.pluralsight;

import java.util.Scanner;

public class SandwichShop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which sandwich do you want? 1 for Regular or 2 for Large?");
        int size = scanner.nextInt();
        scanner.nextLine();

        double baseprice = 0;

        if (size == 1) {
            baseprice = 5.45;
        } else if (size == 2) {
            baseprice = 8.95;
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Would you like your sandwich loaded? (yes/no)");
        String loadedResponse = scanner.nextLine().trim().toLowerCase();

        if (loadedResponse.equals("yes")) {
            if (size == 1) {
                baseprice += 1.00;
                System.out.println("Loaded Regular selected (+$1.00).");
            } else if (size == 2) {
                baseprice += 1.75;
                System.out.println("Loaded Large selected (+$1.75).");
            }
        } else {
            System.out.println("No extra toppings added.");
        }

        System.out.println("Enter your age");
        int age1 = scanner.nextInt();
            scanner.nextLine();

            double discount = 0;

            if (17 >= age1) {
                discount = 0.10;
            } else if (age1 >= 65) {
                discount = 0.20;
            }
                double finalprice = baseprice - (baseprice * discount);

                System.out.println("The cost of your sandwich is $" + finalprice);

            }
        }

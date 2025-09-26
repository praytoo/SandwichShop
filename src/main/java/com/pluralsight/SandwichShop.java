package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size sandwich do you want?\n a. 1: Regular: base price $5.45\n" +
                "b. 2: Large: base price $8.95");
        int size = scanner.nextInt();
                scanner.nextLine();

        double baseprice = 0;

        if (size == 1){
            baseprice = 5.45;
        }else if (size == 2){
            baseprice = 8.95;
        }
        System.out.println("How old are you?\n a. Student (17 years old or younger) — receive a 10% discount\n" +
                "b. Seniors (65 years old or older) — receive a 20% discount");
        int age = Integer.parseInt(scanner.nextLine());
        double discount = 0;
        if (17 >= age) {
            discount = 0.10;
            System.out.println("receive a 10% discount:");
        } else if ( age >= 65) {
            discount = 0.20;
            System.out.println("receive a 20% discount:");
        } else {
            System.out.println("full price");
        };
        double finalprice = baseprice - (baseprice * discount);

        System.out.println("Your sandiwch costs" + " " + "$" + finalprice);
    }
}

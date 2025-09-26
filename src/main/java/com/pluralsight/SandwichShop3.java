package com.pluralsight;

import java.util.Scanner;

public class SandwichShop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which sandwich do you want? 1 or 2?");
        int size = Integer.parseInt(scanner.nextLine());
        double baseprice = 0;
        if (size == 1){
            baseprice = 5.45;
        } else if (size == 2){
            baseprice = 8.95;
        }

        System.out.println("Do you want your sandwich loaded? yes/no");
        String ans = scanner.nextLine();

        if(ans.equals ("yes")){
            baseprice += 1.00;
        } else {
            baseprice += 1.75;
        }

        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());
        double discount = 0;

        if (17>=age){
            discount = 0.10;
        }else if (age >= 65){
            discount = 0.20;
        }

        double finalprice = baseprice - (baseprice * discount);

        System.out.println("Your sandwich costs" + " " + "$" + finalprice);
    }
}

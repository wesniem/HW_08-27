package nyc.c4q.wesniemarcelin;

import java.lang.Object;
import java.util.regex.Matcher;
import java.util.Scanner;

/**
 * Created by wesniemarcelin on 9/4/16.
 */
public class ProblemThirteen {
    // QUESTION 13:Greet the user and ask them for a name.
// Ask the user what flavor of ice cream they would like.
// One-by-one, offer three toppings of your choice which the user will select by inputting 'yes'.
// Calculate the total price of the order: the base ice cream costs $2.33 and each topping is an additional $0.33 cents.
// Calculate a delivery wait time estimate, which should be a random number of minutes between 1 and 60.
// Print an order confirmation to the console that contains the following details: the user's name, ice cream flavor, number of toppings, total price, and delivery wait time.
// package com.c4q.wesnie;
    public static void main(String[] args) {
        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        double total = 0.0;
        double topping = 0;
        int toppingCount = 0;
        float waitTime = 0;
        String yes = "yes";
        String no = "no";
        System.out.println("Hi, " + name + "! what flavor of ice cream would you like?");
        String flavor = scanner.next();
        total = 2.99;
        System.out.println("One " + flavor + " ice cream coming right up!");
        System.out.println("Would you like sprinkles on it?");
        String sprinkles = scanner.next();
        sprinkles = sprinkles.toLowerCase();
        if (sprinkles.equals(yes)) {
            topping = topping + .33;
            toppingCount++;
            waitTime += 3;
        } else {
            System.out.print("Alright, on to the next question:");
        }
        System.out.println("Would you like gummies as well?");
        String gummies = scanner.next();
        gummies = gummies.toLowerCase();
        if (gummies.equals(yes)) {
            topping = topping + .33;
            toppingCount++;
            waitTime += 1;
        } else {
            System.out.println("Got it!");
        }
        System.out.println("Would you like chocolate syrup on your ice cream?");
        String syrup = scanner.next();
        syrup = syrup.toLowerCase();
        if (syrup.equals(yes)) {
            topping = topping + .33;
            toppingCount++;
            waitTime += 1;
        } else {
            System.out.println("Got it!");
        }
        double grandTotal = (topping + total);
        System.out.printf("One order of " + flavor + " ice cream with " + toppingCount + " toppings! Your total is " + grandTotal + " and your estimated wait time is " + waitTime + " minutes! ");
    }
}

// Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.Scanner;

public class Exp9_FloatingPoint {
    public static void main(String[] args) {
        float a, b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Floating Point Number :-");
            a = sc.nextFloat();
            System.out.println("Enter another Floating Point Number :-");
            b = sc.nextFloat();
        }
        if (a == b) {
            System.out.println("Numbers are Equal.");
        } else {
            System.out.println("Numbers are Not Equal.");
        }
    }
}

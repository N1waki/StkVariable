package org.example;
import java.util.Scanner;

public class Main {

    public static boolean scanDouble(String input) {
        for (int i = 0; i < input.length(); i++)
            if ((input.charAt(i) < '0' || input.charAt(i) > '9') && input.charAt(i) != '.')
                return false;
        return true;
    }
    public static double getInputNumber(String message, Scanner scanner){
        boolean ifInputIsValid = true;
        String input = "";
        while (ifInputIsValid) {
            System.out.print(message);
            input = scanner.next();
            ifInputIsValid = !scanDouble(input);
            if (ifInputIsValid) {
                System.out.println("You're fucking peace of shit");
            }
        }
        return Double.parseDouble(input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = getInputNumber("Write your number:", scanner);
        double compareNumber = getInputNumber("Write your compare number:",scanner);
        if (Double.compare(number, compareNumber) > 0){
            System.out.println(number + " bigger then " + compareNumber);
        } else if(Double.compare(number, compareNumber) < 0){
            System.out.println(number + " smaller then " + compareNumber);
        } else {
            System.out.println(number + " is " + compareNumber);
        }
    }
}
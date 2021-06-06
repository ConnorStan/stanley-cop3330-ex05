/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */


package ex05;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input in string form
        System.out.print("What is the first number? ");
        String firstNumber = in.nextLine();
        System.out.print("What is the second number? ");
        String secondNumber = in.nextLine();


        // Numerical Conversion from string to type double to allow for decimals as well as whole numbers
        double number1 = Double.parseDouble(firstNumber);
        double number2 = Double.parseDouble(secondNumber);


        // Various calculations stored within variables
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;


// Output within a single line, which cause actual mental agony.
        System.out.print(number1 + " + " + number2 + " = " + sum + "\n" + number1 + " - " + number2 + " = " + difference + "\n" + number1 + " * " + number2 + " = " + product + "\n" + number1 + " / " + number2 + " = " + quotient);








    }

}

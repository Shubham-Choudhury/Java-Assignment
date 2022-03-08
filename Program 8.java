// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.printf("%.2f degree Fahrenheit is equal to %.2f in Celsius", fahrenheit, celsius);

        sc.close();
    }
}

/* 
        OUTPUT
    Enter a temperature in Fahrenheit: 
    48
    48.00 degree Fahrenheit is equal to 8.89 in Celsius
*/

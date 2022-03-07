// Write a Java Program to Find Factorial of a Number

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int factorial = fact(num);

        System.out.println("Factorial of " + num + " is " + factorial);
        sc.close();
    }

    public static int fact(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num * fact(num - 1);
        }
    }
}

/* 
        OUTPUT
    Enter a Number: 
    5
    Factorial of 5 is 120
*/

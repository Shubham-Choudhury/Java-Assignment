// Write a Java Program to Check Whether a Number is Armstrong Number or Not

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int oriNum = sc.nextInt();
        int num = oriNum;
        int rem, newNum = 0;
        while(num != 0){
            rem = num % 10;
            newNum += (rem * rem * rem);
            num /= 10;
        }
        if(oriNum == newNum){
            System.out.println( oriNum + " is a Armstrong Number");
        }
        else{
            System.out.println( oriNum + " is not a Armstrong Number");
        }
        sc.close();
    }
}

/* 
        OUTPUT
    Enter a Number: 
    407
    407 is a Armstrong Number
*/

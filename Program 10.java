// Write a Java program that reads an positive integer and count the number of digits the number has.

import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int count = 0;
        if(num < 0){
            System.out.println("Please Enter a Positive Integer.");
            sc.close();
            return ;
        }
        else{
            count = countDigit(num);
        }
        System.out.println("Number of digit: " + count);
        sc.close();
    }

    public static int countDigit(int num){
        int count = 0;
        while(num !=0){
            num = num/10;
            count++;
        }
        return count;
    }
}
/*
        OUTPUT
    Enter a Number:
    125697
    Number of digit: 6
*/

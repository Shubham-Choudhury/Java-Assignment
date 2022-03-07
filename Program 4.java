// Write a Java Program to Check Whether a Number is Perfect Number or Not

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num){
            System.out.println(num + " is a Perfect Number.");
        }
        else{
            System.out.println(num + " is not a Perfect Number.");
        }
        
        sc.close();
    }
}

/* 
        OUTPUT
    Enter a Number: 
    496
    496 is a Perfect Number.
*/

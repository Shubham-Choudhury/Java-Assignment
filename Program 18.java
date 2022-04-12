// Write a Java Program to Check Whether a Number is Spy Number or Not

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int product = 1, sum = 0, rNum = num, lastdigit; 
        while(num > 0){      
            lastdigit = num % 10;   
            sum = sum + lastdigit;   
            product = product * lastdigit;    
            num = num / 10;  
        }  
 
        if(sum == product){
            System.out.printf("%d is a spy number.", rNum);  
        }
        else{
            System.out.printf("%d is not a spy number.", rNum); 
        }
        sc.close();
    }  
}

/*
        OUTPUT
    Enter a Number: 
    123
    123 is a spy number.
*/

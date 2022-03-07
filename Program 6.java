// Write a Java Program to Display Fibonacci Series

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Fibonacci Series: ");
        int n = sc.nextInt();
        int i = 1, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
    
        while (i <= n) {
          System.out.print(firstTerm + ", ");
    
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;

          i++;
        }
        sc.close();
      }
}

/* 
        OUTPUT
    Enter length of Fibonacci Series: 
    12
    Fibonacci Series till 12 terms:
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
*/

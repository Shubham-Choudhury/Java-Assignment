// Write a Java Program To Calculate Power Of Number.

import java.util.Scanner;
public class problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Enter Power: ");
        int pow = sc.nextInt();

        long result = 1;
        for(int i = 1; i <= pow; i++){
            result *= num;
        }

        System.out.printf("%d ^ %d = %d", num, pow, result);
        sc.close();
    }
}


/*
        OUTPUT
    Enter Number:
    5
    Enter Power: 
    3
    5 ^ 3 = 125
*/

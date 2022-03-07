// Write a Java program to check whether a string is a Palindrome or not.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        String newString = new String();
        int stringLength = str.length();
        for( int i = (stringLength-1); i >= 0; i--){
            newString = newString + str.charAt(i);
        }

        if(str.equals(newString)){
            System.out.println(str + " is a Palindrome String.");
        }
        else{
            System.out.println(str + " is not a Palindrome String.");
        }
        sc.close();
    }
}

/* 
        OUTPUT
    Enter a String: 
    abababbababa
    abababbababa is a Palindrome String.
*/

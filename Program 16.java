// Write a Java program to convert Roman number to an integer number

import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Roman Number: ");
        String str = sc.next();
        str = str.toUpperCase();
        int len = str.length();
  
         str = str + " ";
         int result = 0;
         for (int i = 0; i < len; i++) {
             char ch   = str.charAt(i);
             char next_char = str.charAt(i+1);
  
             if (ch == 'M') {
                 result += 1000;
             } else if (ch == 'C') {
                 if (next_char == 'M') {
                     result += 900;
                     i++;
                 } else if (next_char == 'D') {
                     result += 400;
                     i++;
                 } else {
                     result += 100;
                 }
             } else if (ch == 'D') {
                 result += 500;
             } else if (ch == 'X') {
                 if (next_char == 'C') {
                     result += 90;
                     i++;
                 } else if (next_char == 'L') {
                     result += 40;
                     i++;
                 } else {
                     result += 10;
                 }
             } else if (ch == 'L') {
                 result += 50;
             } else if (ch == 'I') {
                 if (next_char == 'X') {
                     result += 9;
                     i++;
                 } else if (next_char == 'V') {
                     result += 4;
                     i++;
                 } else {
                     result++;
                 }
             } else { // if (ch == 'V')
                 result += 5;
             }
         }
        System.out.println("\nRoman Number: "+str);
        System.out.println("Equivalent Integer: "+result+"\n");

        sc.close();
     }
 }

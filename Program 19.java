// Write a Java program to replace all vowels from a string with next consonant.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = sc.nextLine();
        String newString = new String();
        String dummyString = "aeiouAEIOU";

        for(int i = 0; i < string.length(); i++){
            char charAtI = string.charAt(i);
            if(dummyString.indexOf(charAtI) < 0){
                newString += charAtI;
            }
            else{
                charAtI += 1;
                newString += charAtI;
            }
        }

        System.out.println("Old String: " + string);
        System.out.println("New String: " + newString);
        sc.close();
    }
}

/* 
        OUTPUT
    Enter a String: 
    Hello World
    Old String: Hello World
    New String: Hfllp Wprld

*/

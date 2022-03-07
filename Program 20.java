// Write a Java program to check if a given string is a permutation of another given string

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        System.out.println("Enter first string: ");
        str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        str2 = sc.nextLine();

        boolean result = stringPermutation(str1, str2);

        if (result){
            System.out.println(str1 + " is a permutation of " + str2);
        }
        else{
            System.out.println(str1 + " is not a permutation of " + str2);
        }
        sc.close();
    }

    public static boolean stringPermutation(String str1, String str2){
        int arr[] = new int[500];

        for(int i = 0; i < str1.length(); i++){
            arr[(int) str1.charAt(i)] += 1;
        }

        for(int i = 0; i < str2.length(); i++){
            arr[(int) str2.charAt(i)] -= 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }
}

/* 
          OUTPUT
  Enter first string: 
  xxyz
  Enter second string: 
  yxzx
  xxyz is a permutation of yxzx
*/

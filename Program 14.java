// Write a Java program to count the occurrences of a given string in another given string.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter main string: ");
        String main_string = sc.nextLine();
        System.out.println("Enter sub-string: ");
        String sub_string = sc.nextLine();
        int countV1 = count_sub_str_in_main_str(main_string, sub_string);
        System.out.println("'"+sub_string + "' has occured " + countV1 + " times in '" + main_string + "'");  
        sc.close();          
   }

   public static int count_sub_str_in_main_str(String main_string, String sub_string) {
        if (main_string == null || sub_string == null) {
            throw new IllegalArgumentException("The given strings cannot be null");
        }
        if (main_string.isEmpty() || sub_string.isEmpty()) {
            return 0;
        }
        int position = 0;
        int ctr = 0;
        int n = sub_string.length();
        while ((position = main_string.indexOf(sub_string, position)) != -1) {
            position = position + n;
            ctr++;
        }
        return ctr;
    }
}
/*
        OUTPUT
    Enter main string: 
    abcd abc aabc baa abcaa
    Enter sub-string: 
    aa
    'aa' has occured 3 times in 'abcd abc aabc baa abcaa'
*/

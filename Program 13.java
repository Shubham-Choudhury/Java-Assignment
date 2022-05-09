// Write a Java program to count the occurrences of each character

import java.util.Scanner;

class problem15 {
    static final int MAX_CHAR = 256;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        getOccuringChar(str);
        sc.close();
    }

    static void getOccuringChar(String str)
    {
        int count[] = new int[MAX_CHAR];
        int len = str.length();
        for (int i = 0; i < len; i++){
            count[str.charAt(i)]++;
        }
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if(str.charAt(i) == ' '){
                    continue;
                }
                else if (str.charAt(i) == ch[j]){
                    find++;
                }

            }
 
            if (find == 1)
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
    }
}
/*
        OUTPUT
    Enter a String: 
    Triveni Devi Bhalotia College
    Number of Occurrence of T is:1
    Number of Occurrence of r is:1
    Number of Occurrence of i is:4
    Number of Occurrence of v is:2
    Number of Occurrence of e is:4
    Number of Occurrence of n is:1
    Number of Occurrence of D is:1
    Number of Occurrence of B is:1
    Number of Occurrence of h is:1
    Number of Occurrence of a is:2
    Number of Occurrence of l is:3
    Number of Occurrence of o is:2
    Number of Occurrence of t is:1
    Number of Occurrence of C is:1
    Number of Occurrence of g is:1
*/

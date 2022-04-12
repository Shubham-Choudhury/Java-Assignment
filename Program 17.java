// Write a Java Program to find Smallest Number in an integer Array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array Element: ");
        int elm = sc.nextInt();
        System.out.printf("Enter %d Array Elements: \n", elm);
        int arr[] = new int[elm];
        for(int i = 0; i < elm; i++){
            arr[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < elm; i++)   
        {  
            for (int j = i + 1; j < elm; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        } 
        System.out.println("Smallest Array Element : " + arr[0]);
        sc.close();
    }
}


/*
        OUTPUT
    Enter Number of Array Element: 
    5
    Enter 5 Array Elements: 
    23
    4
    65
    7
    9
    Smallest Array Element : 4
*/

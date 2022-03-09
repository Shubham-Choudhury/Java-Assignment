// Write a Java program to form the largest number from a given list of non negative integers.

import java.util.*;

public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.printf("\nOriginal array: "+Arrays.toString(nums));	
        System.out.printf("\nLargest number using the said array numbers: "+largest_Numbers(nums));
        sc.close();
    }

    public static String  largest_Numbers(int[] num) {
        String[] array_nums = Arrays.stream(num).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(array_nums, (String str1, String str2) -> (str2 + str1).compareTo(str1 + str2));
        return Arrays.stream(array_nums).reduce((a, b) -> a.equals("0") ? b : a + b).get();
    }	
}

/* 
        OUTPUT
    Enter number of array elements: 
    6
    Enter 6 array elements:
    1 2 3 0 4 6

    Original array: [1, 2, 3, 0, 4, 6]
    Largest number using the said array numbers: 643210
*/

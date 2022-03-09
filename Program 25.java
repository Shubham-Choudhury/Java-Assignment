// Write a Java Program to Create Rock-Paper-Scissors Game.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int com_Choice = random.nextInt(3);
        System.out.println("Enter \"0\" for Rock.");
        System.out.println("Enter \"1\" for Paper.");
        System.out.println("Enter \"2\" for Scissors.");
        System.out.print("Enter Your Choice: ");
        int user_Choice = sc.nextInt();
        if(user_Choice < 3 && user_Choice >= 0){
            play_game(com_Choice, user_Choice);
        }
        else{
            System.out.println("Wrong Choice!!\nPlease Enter Valid Choice");
        }
        sc.close();
    }

    public static String text(int num){
        if(num == 0){
            return "Rock";
        }
        else if(num == 1){
            return "Paper";
        }
        else{
            return "Scissors";
        }
    }

    public static void play_game(int com_Choice, int user_Choice){
        System.out.println("Your Choice: " + text(user_Choice));
        System.out.println("Computer Choice: " + text(com_Choice));
        if(com_Choice == user_Choice){
            System.out.println("It's a tie!");
        }
        else if(user_Choice == 0){
            if(com_Choice == 1){
                System.out.println("Computer Won!");
            }
            else{
                System.out.println("You Won!");
            }
        }
        else if(user_Choice == 1){
            if(com_Choice == 0){
                System.out.println("You Won!");
            }
            else{
                System.out.println("Computer Won!");
            }
        }
        else{
            if(com_Choice == 0){
                System.out.println("Computer Won!");
            }
            else{
                System.out.println("You Won!");
            }
        }
    }
}

/*
        OUTPUT
    Enter "0" for Rock.
    Enter "1" for Paper.
    Enter "2" for Scissors.
    Enter Your Choice: 2
    Your Choice: Scissors
    Computer Choice: Paper
    You Won!
*/

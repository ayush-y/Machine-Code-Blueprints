package TernayProgram;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 5;
        do{
            System.out.print("Please enter your number to guess: ");
            num = sc.nextInt();
            if(num != 5){
                System.out.println("Try again");
            }
        }while(num != 5);
        System.out.println("You guessed it right!");
    }

}

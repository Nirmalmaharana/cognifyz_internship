package com.nirmal.main;

import java.util.Random;
import java.util.Scanner;

public class TestBasedGame 
{
	 public static void main(String[] args) 
	 {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        int numberToGuess = random.nextInt(10) ; // 1 to 10
		        int attempts = 3;//

		        System.out.println("Welcome to the Guessing Game!");
		        System.out.println("Guess a number between 1 and 10.");
		        System.out.println("You have " + attempts + " tries.\n");

		        while (attempts > 0)
		        {
		            System.out.print("Enter your guess: ");
		            int guess = scanner.nextInt();

		            if (guess == numberToGuess) {
		                System.out.println("Correct! You win!");
		                break;
		            } else if (guess < numberToGuess) {
		                System.out.println("Too low!");
		            } else {
		                System.out.println("Too high!");
		            }

		            attempts--;

		            if (attempts > 0) {
		                System.out.println("Tries left: " + attempts);
		            } else {
		                System.out.println("Game Over! The number was: " + numberToGuess);
		            }
		        }//end While Loop

		        scanner.close();
		 

		
		
	}

}

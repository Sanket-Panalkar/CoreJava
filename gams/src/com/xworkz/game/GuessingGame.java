package com.xworkz.game;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;
    int guess, attempts = 0;

    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Guess a number between 1 and 100:");

    do {
      guess = input.nextInt();
      attempts++;

      if (guess > randomNumber) {
        System.out.println("Too high! Guess again:");
      } else if (guess < randomNumber) {
        System.out.println("Too low! Guess again:");
      }
    } while (guess != randomNumber);

    System.out.println("Congratulations, you guessed the number in " + attempts + " attempts!");
  }

}


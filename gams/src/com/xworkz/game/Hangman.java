package com.xworkz.game;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"hello", "world", "java", "programming", "computer", "science"};
        String word = words[(int)(Math.random() * words.length)];
        int maxAttempts = 6;
        int attempts = 0;
        String guessedLetters = "";
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++) {
            hiddenWord += "_";
        }
        while (attempts < maxAttempts && !hiddenWord.equals(word)) {
            System.out.println("Guess a letter:");
            String letter = input.next();
            if (guessedLetters.contains(letter)) {
                System.out.println("You already guessed that letter.");
            } else if (word.contains(letter)) {
                System.out.println("Correct!");
                guessedLetters += letter;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter.charAt(0)) {
                        hiddenWord = hiddenWord.substring(0, i) + letter + hiddenWord.substring(i + 1);
                    }
                }
                System.out.println(hiddenWord);
            } else {
                System.out.println("Incorrect!");
                guessedLetters += letter;
                attempts++;
                drawHangman(attempts);
            }
        }
        if (hiddenWord.equals(word)) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Sorry, you ran out of attempts. The word was: " + word);
            drawHangman(attempts);
        }
    }

    public static void drawHangman(int attempts) {
        switch (attempts) {
            case 1:
                System.out.println("  ___");
                System.out.println(" |   |");
                System.out.println(" |   O");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_");
                break;
            case 2:
                System.out.println("  ___");
                System.out.println(" |   |");
                System.out.println(" |   O");
                System.out.println(" |   |");
                System.out.println(" |");
                System.out.println("_|_");
                break;
            case 3:
                System.out.println("  ___");
                System.out.println(" |   |");
                System.out.println(" |   O");
                System.out.println(" |  /|");
                System.out.println(" |");
                System.out.println("_|_");
                break;
            case 4:
                System.out.println("  ___");
                System.out.println(" |   |");
                System.out.println(" |   O");
                System.out.println(" |  /|\\");
                System.out.println(" |");
                System.out.println("_|_");
                break;
            case 5:
                System.out.println("  ___");
                System.out.println(" ");
        }}}

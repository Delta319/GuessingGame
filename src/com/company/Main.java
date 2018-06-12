package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*How to get a random number


        double randomNumber;
        randomNumber = Math.random();
        System.out.println("The random number is: " + randomNumber);

        double randomNumberTimesHundred = randomNumber * 100;
        System.out.println("The Random Number times 100 is :" + randomNumberTimesHundred);

        int randomNumberRoundedToCeil = (int) Math.ceil(randomNumberTimesHundred);
        System.out.println("The Rounded ceil is: " + randomNumberRoundedToCeil);

        int randomNumberRoundedToFloor = (int) Math.floor(randomNumberTimesHundred);
        System.out.println("The Rounded to Floor is: " + randomNumberRoundedToFloor);

        int randomNumberRoundedNormally = (int) Math.round(randomNumberTimesHundred);
        System.out.println("The Rounding that we're used to: " + randomNumberRoundedNormally);*/

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Guessing game! I'm thinking of a number between 1 and 100. Can you figure it out?");

        int numberOfGuesses = 0;
        final int MAX_GUESS_COUNT = 4;


        int randomNumber = (int) Math.ceil(Math.random() * 100);
        //System.out.println(randomNumber);

        int guessedNumber;

        do {


            try {
                do {


                    System.out.println("Guess a number between 1 and 100");
                    guessedNumber = input.nextInt();
                    System.out.println("You guessed the number " + guessedNumber);

                    if (randomNumber > guessedNumber) {
                        System.out.println("Your guess is too low. Guess higher.");
                        numberOfGuesses ++;
                        System.out.println("You have made" + numberOfGuesses + "guesses.");

                    } else if (randomNumber < guessedNumber) {
                        System.out.println("Your guess is too high. Guess lower.");
                        numberOfGuesses ++;
                        System.out.println("You have made" + numberOfGuesses + "guesses.");

                    } else {
                        System.out.println("Congratulations! You guessed my number " + randomNumber + " in " + numberOfGuesses + " tries!");
                    }
                } while (randomNumber != guessedNumber && numberOfGuesses < MAX_GUESS_COUNT);12
            } catch (Exception e) {
                System.out.println("Please enter a real number!");
            }
        } while (numberOfGuesses < MAX_GUESS_COUNT);
    }
}




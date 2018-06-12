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

        int randomNumber = (int) Math.ceil(Math.random() * 100);
        System.out.println(randomNumber);

        int guessedNumber;
        System.out.println("Guess a number between 1 and 100");
        guessedNumber = input.nextInt();
        System.out.println("You guessed the number " + guessedNumber);

        if (randomNumber > guessedNumber) {
            System.out.println("Your guess is too low. Guess higher.");

        } else if (randomNumber < guessedNumber) {
            System.out.println("Your guess is too high. Guess lower.");

        } else {
            System.out.println("Congratulations! You guessed my number " + randomNumber + "!");
        }

    }
}



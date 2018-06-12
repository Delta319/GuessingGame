package com.company;

public class Main {

    public static void main(String[] args) {

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
        System.out.println("The Rounding that we're used to: " + randomNumberRoundedNormally);
    }
}



package Day30;

import java.util.Random;

public class RandomTwoDice8 {
    public static void main(String[] args) {

        System.out.println(" Two dices sum of 8");

        Random zar1 = new Random();

        int dice1 = 0;
        int dice2 = 0;
        int sumOfDice = 0;

        int counter = 0; // Kacinci kez de sayilarin toplaminin 8 buldugunu bulmak icin
        //  sumOfDice = dice1 + dice2; bunu while in disina yazmak zorunde miyiz
        while (sumOfDice!= 8){
            dice1 = zar1.nextInt(6) + 1;
            dice2 = zar1.nextInt(6) + 1;
            sumOfDice = dice1 + dice2;
            System.out.println("dice1 = " + dice1 + " dice2 = " + dice2);
            counter++;
        }
        System.out.println("counter = " + counter);
    }
}

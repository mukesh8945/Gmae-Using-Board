import java.util.*;
// package com.company;
// import java.util.Random;
// import java.util.Scanner;

public class GameUsing {
   
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random r1 = new Random();
        number = r1.nextInt(101);
    }
    void takeUserInput(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Guess a number: ");
        inputNumber = ob.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber == number){
            System.out.println("Congrats!!You've guessed the correct number");
            return true;
        }
        else if(inputNumber > number){
            System.out.println("You've guessed a number higher than the required number.Please guess again");
        }
        else if(inputNumber < number){
            System.out.println("You've guessed a number smaller than the required number.Please guess again");
        }
        return false;
    }
}
public class Guess_The_Number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
    
}

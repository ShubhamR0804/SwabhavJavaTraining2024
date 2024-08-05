package com.dayninecalisthenics.assignment.model;

import java.util.Random;
import java.util.Scanner;

public class RefactoredPigGame {

    private static final int winningScore = 20;
    private Scanner scanner;
    private Random random;
    
    private int totalScore;
    private int turnScore;
    private int turnCount;
    private boolean flag;
    
    public RefactoredPigGame() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.totalScore = 0;
        this.turnScore = 0;
        this.turnCount = 1;
    }
    
    public void startGame() {
        System.out.println("Let's Play PIG!");
        while(totalScore < winningScore) {
            System.out.println("\nTURN " + turnCount + "\n");
            flag = false;
            turnScore = 0;
            this.turn();
            turnCount++;
        }
        System.out.println("You have finished in " + (turnCount - 1) + " turns!");
        System.out.println("Game Over");
    }
    
    private void turn() {
        while(!flag) {
            System.out.println("Roll or hold ? (r/h): ");
            String choice = scanner.nextLine().toLowerCase();
            if(choice.isEmpty()) {
                System.out.println("Please enter 'r' to roll or 'h' to hold.");
                continue;
            }
            char firstChar = choice.charAt(0);
            checkChoice(firstChar);
        }
    }
    
    private void checkChoice(char firstChar) {
        if (firstChar == 'h') {
            this.hold();
            return;
        }
        if (firstChar == 'r') {
            this.roll();
            return;
        }
        System.out.println("Invalid input. Please enter 'r' to roll or 'h' to hold.");
    }
    
    private void roll() {
        int die = random.nextInt(6) + 1;
        System.out.println("Die: " + die);
        
        if(die == 1) {
            System.out.println("Score turns to zero");
            flag = true;
            turnScore = 0;
            return;
        }
        
        turnScore += die;
        if((totalScore + turnScore) >= winningScore) {
            this.hold();
        }
    }
    
    private void hold() {
        totalScore += turnScore;
        flag = true;
        System.out.println("Score for turn " + turnCount + " is " + turnScore);
        System.out.println("Total score " + totalScore);
    }
}


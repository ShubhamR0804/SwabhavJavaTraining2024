package com.dayfour.assignments;

import java.util.Random;
import java.util.Scanner;

public class PigGame {

 public static void main(String[] args) {
	 
  Scanner obj = new Scanner(System.in);
  Random random = new Random();
  
  int totalScore = 0;
  int turnScore = 0;
  int turnCount = 1;
  
  System.out.println("Let's Play PIG!");
  
  while(totalScore < 20) {
   turnScore = 0;
   boolean turnIsOver = false;
   
   System.out.println("\nTURN " + turnCount + "\n");
   
   while(!turnIsOver) {
    System.out.println("Roll or hold ? (r/h): ");
    char choice = obj.next().toLowerCase().charAt(0);
    
    if(choice == 'r') {
     int die = random.nextInt(6) + 1;
     System.out.println("Die: " + die);
     
     if(die == 1) {
      System.out.println("Score turns to zero");
      System.out.println("\n --------X---------\n");
      turnIsOver = true;
      turnScore = 0;
     } else {
      turnScore += die;
      if(turnScore > 20) {
       totalScore += turnScore;
       System.out.println("Score for turn " + turnScore);
       System.out.println("Total score " + totalScore);
       turnIsOver = true;
      }
     }
    } else if(choice == 'h') {
     totalScore += turnScore;
     System.out.println("Score for turn " + turnScore);
     System.out.println("Total score " + totalScore);
     turnIsOver = true;
    } else {
     System.out.println("Invalid input");
    }
   }
   turnCount++;
  }
  System.out.println("You have finished in " + (turnCount - 1) + " turns!");
  System.out.println("Game Over");
  obj.close();
 }

}

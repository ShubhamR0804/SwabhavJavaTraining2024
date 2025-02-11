package com.techlabs.facade.model.assignment;

import java.util.Scanner;

public class Game {
	
	private Board board;
	private IPlayer xPlayer;
	private IPlayer oPlayer;
	private IPlayer currentPlayer;
	
	private int rows;
	private int columns;
	
	public Game(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	    board = new Board(rows, columns);
	    xPlayer = new XPlayer();
	    oPlayer = new OPlayer();
	    currentPlayer = xPlayer;
	  }
	
	public void switchPlayer() {
		currentPlayer = (currentPlayer == xPlayer) ? oPlayer: xPlayer;
	}
	
	public void play() {
		Scanner scanner = new Scanner(System.in);
		boolean gameWon = false;
		int moveCount = 0;
		while(!gameWon && moveCount< rows*columns) {
			System.out.println("Current Player : "+currentPlayer.getSymbol() +", Enter position of row and column eg: [1-3]: ");
			board.printBoard();
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			
			if(board.isValidMove(row, column)) {
				board.makeMove(row, column, currentPlayer.getSymbol());
					gameWon = board.checkWin(currentPlayer.getSymbol());
					
					if(gameWon) {
						board.printBoard();
						System.out.println("Player :" +currentPlayer.getSymbol()+ " Wins.");
					}
					else {
						switchPlayer();
						moveCount++;
					}	
			} else {
				System.out.println("Invalid move");
			}
			
		}
		if(!gameWon) {
			board.printBoard();
			System.out.println("Game Draw");
		}
		scanner.close();
	}
}

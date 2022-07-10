package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeProgram {

    public static char[] board = new char[10];
    public static char player;
    public static char computer;

    //creating an empty board with space
    public static void makeEmptyBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    //asking player to select x / o
    public static void playerSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the symbol to choose X/O ");
        String userChoice = scanner.next();
        switch (userChoice) {
            case "X":
                player = 'X';
                computer = 'O';
                System.out.println("The player entered option is  " + player);
                break;
            case "O":
                player = 'O';
                computer = 'X';
                System.out.println("The player entered option is " + player);
                break;
            default:
                System.out.println("Please enter a valid choice");
                break;
        }
    }

    //display board
    public static void displayBoard() {
        System.out.println("Currently the board looks like following ");
        System.out.println("");

        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println("");
    }

    //player turn
    public static void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the position where you want to make a move (1-9):");

        Integer[] positionOfCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int userRequiredPosition = scanner.nextInt();

        if (Arrays.asList(positionOfCells).contains(userRequiredPosition)) {
            board[userRequiredPosition] = player;
            displayBoard();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome Tic Tac Toe program ");
        makeEmptyBoard();
        playerSelection();
        displayBoard();
        playerTurn();

    }
}


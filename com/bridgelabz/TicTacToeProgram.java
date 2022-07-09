package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeProgram {

    public static char[] board;

    //creating board
    public static char[] creatingBoard() {
        char[] board = new char[10];
        //zero is ignores for user friendly
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }

    //using letter x,0 to input
    public static char userSymbol() {
        char computerInput = 'O';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character X or O");
        char userInput = scanner.next().charAt(0);
        if (userInput == computerInput) {
            System.out.println("Player choose computer input ");
        } else if (userInput != computerInput) {
            computerInput = 'O';
            System.out.println("player chosed" + computerInput);
        }
        return userInput;
    }

    //creating board
    public static char[] displayBoard() {
        int initially = 1;
        for (int i = initially; i <= board.length - initially; i++) {
            System.out.println(board[i] + " | " + board[i + 1] + " | " + board[i + 2]);
            initially = initially + 3;
        }
        return board;
    }


    public static void main(String[] args) {
        System.out.println("Welcome Tic Tac Toe program ");
        board = creatingBoard();
        userSymbol();
        displayBoard();

    }
}


package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeProgram {

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
        char userInput = scanner.next().charAt(0);
        if (userInput == computerInput) {
            System.out.println("Player choose computer input ");
        } else if (userInput != computerInput) {
            computerInput = 'O';
            System.out.println("player chosed" + computerInput);
        }
        return userInput;
    }

    public static void main(String[] args) {
        System.out.println("Welcome Tic Tac Toe program ");
        creatingBoard();
        userSymbol();
    }
}


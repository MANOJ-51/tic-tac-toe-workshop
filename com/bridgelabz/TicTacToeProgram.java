package com.bridgelabz;

public class TicTacToeProgram {

    //creating board
    public static void creatingBoard() {
        char[] board = new char[10];
        //zero is ignores for user friendly
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome Tic Tac Toe program ");
        creatingBoard();
    }
}

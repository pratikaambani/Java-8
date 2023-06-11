package com.practise.individualprograms;

import java.util.Scanner;

public class TicTacToe {
    public static String startGame(Game game, Scanner scan) {
        String winner = "";
        game.initializeBoard();
        System.out.println("Tic-Tac-Toe!");
        do
        {
            System.out.println("Current board layout:");
            game.printBoard();
            int row;
            int col;
            do
            {
                System.out.println("Player " + game.getCurrentPlayer() + ", enter an empty row and column to place your mark!");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
            }
            while (!game.placeMark(row, col)); //todo : implement this method in Game class
            game.changePlayer();
        }
        while(!game.isWinner() && !game.isBoardFull());  // todo : implement these methods in Game class
        if (game.isBoardFull() && !game.isWinner())      // todo : implement these methods in Game class
        {
            System.out.println("The game was a tie!");
        }
        else
        {
            System.out.println("Current board layout:");
            game.printBoard();
            game.changePlayer();
            char winnerPlayer = Character.toUpperCase(game.getCurrentPlayer());
            System.out.println(winnerPlayer + " Wins!");
            if(winnerPlayer == 'O') {
                winnerPlayer = '0';
            }
            winner = winnerPlayer+"";
        }
        return winner;
    }
}

class Game {
    private char[][] board;
    private char currentPlayer;

    public Game() {
        board = new char[3][3];
        currentPlayer = 'x';
        initializeBoard();
    }

    //returns currentPlayerMark
    public char getCurrentPlayer()
    {
        return currentPlayer;
    }


    // initialize board to empty values.
    public void initializeBoard() {
        // Loop through rows
        for (int i = 0; i < 3; i++) {
            // Loop through columns
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the current board
    public void printBoard() {
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }


    // Change player marks back and forth.
    public void changePlayer() {
        if (currentPlayer == 'x') {
            currentPlayer = 'o';
        }
        else {
            currentPlayer = 'x';
        }
    }

    // Loop through all cells of the board and if any cell has empty value (contains char '-') then return false.
    // Otherwise board is full.
    public boolean isBoardFull() {
        //todo: complete this;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Returns true if there is a win, false otherwise.
    public boolean isWinner() {
        //todo : complete this
        // check for all rows
        for (int i = 0; i < 3; i++) {
            char key = board[i][0];
            if (key != '-' && board[i][1] == key && board[i][2] == key) {
                return true;
            }
        }
        // check for all columns
        for (int i = 0; i < 3; i++) {
            char key = board[0][i];
            if (key != '-' && board[1][i] == key && board[2][i] == key) {
                return true;
            }
        }
        // check for diagonals
        char key = board[1][1];
        if (key != '-' && board[0][0] == key && board[2][2] == key) {
            return true;
        }
        if (key != '-' && board[2][0] == key && board[0][2] == key) {
            return true;
        }

        return false;
    }

    // Places a mark at the cell specified by row and col with the mark of the current player.
    public boolean placeMark(int row, int col) {

        //todo: complete this
        if (board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }
}

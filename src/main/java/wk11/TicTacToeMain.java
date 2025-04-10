package wk11; /************************************************************
* This is starting code for a program that allows two users 
* to play Tic-Tac-Toe (also called noughts and crosses). It
* demonstrates manipulating 2D arrays
* To implement:
*   - Stub out all methods so that code compiles
*   - Implement printBoard() and resetBoard()
*   - Test
*   - Implement move()
*   - Uncomment the GAME LOOP and test again
*   - Finish checkWinHorizontal()
*   - Test
*   - Finish checkWinVertical()
*   - Test
*   - Finish checkDiagonal()
*   - Test

* Author: Dr. Joshua Gross (jgross@csumb.edu)
* Date: Spring 203
************************************************************/

import java.util.Scanner;
import java.util.Stack;

class Move {
    private final int location;
    private final char player;

    public Move(int location, char player) {
        this.location = location;
        this.player = player;
    }

    public int getLocation() {
        return location;
    }

    public char getPlayer() {
        return player;
    }
}

class Game {
    public static final int SIZE = 3;
    private char [][] board = new char[SIZE][SIZE];
    private int moves = 0;
    private Stack<Move> moveHistory = new Stack<>();


    public char getChar(int col, int row) {
        return (char) (row * 3 + col + 49);
    }

    public void resetBoard() {
        moves = 0;
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                board[row][col] = getChar(col, row);
            }
        }
    }

    public void printBoard() {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }


    public void move(char c, Scanner in) {
        moves++;
        int row, col, loc;
        do {
            System.out.print("Enter your move (or u to undo) : ");
            loc = in.nextInt();
            if(loc < 1 || loc > 9) {
                continue;
            }
            row = (loc - 1)/SIZE;
            col = (loc - 1)%SIZE;
            if(board[row][col] == 'X' || board[row][col] == 'O') {
                continue;
            }
            break;
        }  while(true);

        board[row][col] = c;
        // instantiate the Move class
        // put in stack
    }

    public boolean checkWin() {
        return checkWinHorizontal() ||  checkWinVertical() ||
                checkWinDiagonal();
    }

    public boolean checkWinDiagonal() {
        return (board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[2][0] == board[1][1] && board[1][1] == board[0][2]);
    }

    public boolean checkWinVertical() {
        for(int col = 0; col < SIZE; col++) {
            if(board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWinHorizontal() {
        for(int row = 0; row < SIZE; row++) {
            if(board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return true;
            }
        }
        return false;
    }
}

public class TicTacToeMain {



    public static void main(String [] args) {
        int moves = 0;
        Game g = new Game();
        g.resetBoard();
        boolean play = true;
        String replay;
        Scanner in = new Scanner(System.in);

        // replay loop
        while(play) {

            System.out.print("Starting a new game\n");
            g.resetBoard();
            moves = 0;

            // game loop
             while(moves < 9) {
                 g.printBoard();
                 g.move('X', in);
                 moves++;

                 if(g.checkWin()) {
                     System.out.print("X won!\n");
                     break;
                 } else if(moves == 9) {
                     System.out.print("Tie!\n");
                     break;
                 }

                 g.printBoard();
                 g.move('O', in);
                 moves++;
                 if(g.checkWin()) {
                     System.out.print("O won!\n");
                     break;
                 }
             }

            g.printBoard();
            System.out.print("\n");
            System.out.print("Play again? (y/n) ");
            replay = in.next();
            if(! replay.equalsIgnoreCase("y")) {
                play = false;
            }

        }
    }


}

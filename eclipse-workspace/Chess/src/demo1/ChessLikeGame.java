package demo1;

import java.util.Scanner;

public class ChessLikeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[4][8];
        int pieceRow = 0;
        int pieceCol = 0;

        initializeBoard(board);

        System.out.println("Welcome to the Chess-Like Game!");

        while (true) {
            printBoard(board);
            System.out.println("Enter your move (e.g., '2d' or 'q' to quit): ");
            String input = scanner.next();

            if (input.equals("q")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (input.length() != 2) {
                System.out.println("Invalid input. Please enter a valid move.");
                continue;
            }

            int newRow = Character.getNumericValue(input.charAt(0)) - 1;
            int newCol = input.charAt(1) - 'a';

            if (isValidMove(pieceRow, pieceCol, newRow, newCol)) {
                board[pieceRow][pieceCol] = '-';
                pieceRow = newRow;
                pieceCol = newCol;
                updatePieceBehavior(board, pieceRow, pieceCol);
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }
    }

    public static void initializeBoard(char[][] board) {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = '-';
            }
        }
        board[0][0] = 'K';  
    }

    public static void updatePieceBehavior(char[][] board, int row, int col) {
        char behavior = '-';
        if (row == 0) {
            behavior = 'K'; 
        } else if (row == 1) {
            behavior = 'E';
        } else if (row == 2) {
            behavior = 'H'; 
        } else if (row == 3) {
            behavior = 'C'; 
        }
        board[row][col] = behavior;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(int currentRow, int currentCol, int newRow, int newCol) {
        int rowDiff = Math.abs(newRow - currentRow);
        int colDiff = Math.abs(newCol - currentCol);

        if (currentRow == 0) {
            // King behavior
            return rowDiff <= 1 && colDiff <= 1;
        } else if (currentRow == 1) {
            // Rook behavior
            return rowDiff == 0 || colDiff == 0;
        } else if (currentRow == 2) {
            // Knight behavior
            return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
        } else if (currentRow == 3) {
            // Bishop behavior
            return rowDiff == colDiff;
        }

        return false;
    }
}

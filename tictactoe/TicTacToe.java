/*
 Susie Du - Class AP C8
Instructor: Daniel Gunn
2017/10/18
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Du
 */
public class TicTacToe {

    private static String[][] board;
    private static final int Rows = 3;
    private static final int Cols = 3;

    /**
     * @param args the command line arguments
     */
    public TicTacToe() {
        board = new String[Rows][Cols];
        for (int r = 0; r < Rows; r++) {
            for (int c = 0; c < Cols; c++) {
                board[r][c] = " ";
            }
        }
    }

    public void makeMove(int r, int c, String symbol) {
        board[r][c] = symbol;
    }

    public String toString() {
        String s = "";
        for (int r = 0; r < Rows; r++) {
            s = s + "|";
            for (int c = 0; c < Cols; c++) {
                s = s + board[r][c];
            }
            s = s + "|\n";
        }
        return s;
    }

    public static boolean checkIllegal(int row, int column) {
        if ("x".equals(board[row][column]) || "o".equals(board[row][column])) {
            return true;
        } 
        return false;
    }

    public static boolean checkWon(String player, int r, int c) {
        if (player.equals(board[r][0]) && player.equals(board[r][1]) && player.equals(board[r][2]) || (player.equals(board[0][c]) && player.equals(board[1][c]) && player.equals(board[2][c]))) {
            return true;
        } else if (r == c) {
            if (player.equals(board[0][0]) && player.equals(board[1][1]) && player.equals(board[2][2])) {
                return true;
            }
        } else if (r + c == 2) {
            if (player.equals(board[0][2]) && player.equals(board[1][1]) && player.equals(board[2][0])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(board[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        Scanner input = new Scanner(System.in);
        System.out.print(game);
        int count = 0;
        boolean playing = true;
        boolean won;
        boolean illegal = false;
        while (playing) {
            if (count % 2 == 0) {
                do {
                    System.out.print("Player 1 please input your next row:");
                    int r = input.nextInt() - 1;
                    System.out.print("Plese input your next column:");
                    int c = input.nextInt() - 1;
                    String player1 = "x";
                    illegal = checkIllegal(r, c);
                    if (illegal) {
                        System.out.println("Invalid move,try again.");
                    } else {
                        game.makeMove(r, c, player1);
                        System.out.print(game.toString());
                        won = checkWon(player1, r, c);
                        if (won) {
                            System.out.println("Congratulation! The winner is player 1");
                            break;
                        }
                    }
                } while (illegal);
            } else {
                do {
                    System.out.print("Player 2 please input your next row:");
                    int r = input.nextInt() - 1;
                    System.out.print("Plese input your next column:");
                    int c = input.nextInt() - 1;
                    String player2 = "o";
                    illegal = checkIllegal(r, c);
                    if (illegal) {
                        System.out.println("Invalid move,try again.");
                    } else {
                        game.makeMove(r, c, player2);
                        System.out.print(game.toString());
                        won = checkWon(player2, r, c);
                        if (won) {
                            System.out.println("Congratulation! The winner is player 2");
                            break;
                        }
                    }
                } while (illegal);
            }

            count++;
            playing = checkTie();
            if (!playing) {
                System.out.println("It is a draw!");
            }
        }
    }
}

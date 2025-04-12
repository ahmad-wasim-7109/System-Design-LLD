package src.main.java.com.lld.TicTacToe.Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final PlayingPiece[][] board;
    private final int size;

    public int getSize() {
        return size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(" " + board[i][j].pieceType.name() + "  ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }


    public List<int[]> getFreeSpaces() {
        List<int[]> emptySpaces = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    int[] val = {i, j};
                    emptySpaces.add(val);
                }
            }
        }
        return emptySpaces;
    }

    public boolean addPiece(Integer x, Integer y, PlayingPiece playingPiece) {
        if(x >= this.getSize() || y >= this.getSize() || board[x][y] != null) return false;
        board[x][y] = playingPiece;
        return true;
    }
}
package src.main.java.com.lld.TicTacToe;

import src.main.java.com.lld.TicTacToe.Model.Board;
import src.main.java.com.lld.TicTacToe.Model.PieceType;
import src.main.java.com.lld.TicTacToe.Model.Player;
import src.main.java.com.lld.TicTacToe.Model.PlayingPieceO;
import src.main.java.com.lld.TicTacToe.Model.PlayingPieceX;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameboard;

    public TicTacToeGame() {
        initialiseGame();
    }

    public void initialiseGame() {
        //Create a board(n x n)
        gameboard = new Board(3);
        // initialise players
        players = new LinkedList<>();
        Player player1 = new Player("Player1", new PlayingPieceX());
        Player player2 = new Player("Player2", new PlayingPieceO());
        players.add(player1);
        players.add(player2);
    }

    public String startGame() {
        while (true) {
            gameboard.printBoard();
            Player currentPlayer = players.removeFirst();
            if (gameboard.getFreeSpaces().isEmpty()) {
                break;
            }
            //read user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Player: " + currentPlayer.userName() + " Enter row, col: ");
            String[] coordinateValues = scanner.nextLine().split(",");
            int row = Integer.parseInt(coordinateValues[0].trim());
            int col = Integer.parseInt(coordinateValues[1].trim());
            if (!gameboard.addPiece(row, col, currentPlayer.playingPiece())) {
                System.out.println("Incorrect position chosen, Pls try again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);
            if (isThereAWinner(row, col, currentPlayer.playingPiece().getPieceType())) {
                gameboard.printBoard();
                return currentPlayer.userName();
            }
        }
        return "Tie";
    }

    private boolean isThereAWinner(int row, int col, PieceType pieceType) {
        var rowMatch = true;
        var columnMatch = true;
        var diagonalMatch = true;
        var antiDiagonalMatch = true;
        // checking if row is not matching
        for (int c = 0; c < gameboard.getSize(); c++) {
            if (gameboard.getBoard()[row][c] == null || !gameboard.getBoard()[row][c].getPieceType().equals(pieceType)) {
                rowMatch = false;
            }
        }

        // check if col is not matching
        for (int r = 0; r < gameboard.getSize(); r++) {
            if (gameboard.getBoard()[r][col] == null || !gameboard.getBoard()[r][col].getPieceType().equals(pieceType)) {
                columnMatch = false;
            }
        }

        // check if diagonals are not matching
        for (int d = 0; d < gameboard.getSize(); d++) {
            if (gameboard.getBoard()[d][d] == null || !gameboard.getBoard()[d][d].getPieceType().equals(pieceType)) {
                diagonalMatch = false;
            }
        }

        // check for anti-diagonals not matching
        for (int ad = gameboard.getSize() - 1; ad >= 0; ad--) {
            if (gameboard.getBoard()[ad][ad] == null || !gameboard.getBoard()[ad][ad].getPieceType()
                    .equals(pieceType)) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}

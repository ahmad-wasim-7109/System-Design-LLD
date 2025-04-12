package src.main.java.com.lld.TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        var result = ticTacToeGame.startGame();
        System.out.println(result.equals("Game is a Tie 🙂") ? "Tie" : "Game Winner is: " + result + " 🎉");
    }
}

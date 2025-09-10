package src.main.java.com.lld.SnakeAndLadder.src.main.java;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game() {
        initialiseGame();
    }

    private void initialiseGame() {
        board = new Board(10, 5, 5);
        dice = new Dice();
        addPlayers();
        winner = null;

    }

    private void addPlayers() {
        Player p1 = new Player("Player1", 0);
        Player p2 = new Player("Player2", 0);
        players.add(p1);
        players.add(p2);
    }

    public void startGame() {
        while (winner == null) {
            Player player = findPlayerTurn();
            System.out.println("Player: " + player.getName() + " is Playing currently");
            int val = dice.rollDice();
            System.out.println("Player " + player.getName() + " initial score is " + player.getPosition());
            System.out.println("Dice score is: " + val);
            int currentPosition = player.getPosition() + val;
            if(currentPosition > board.getCells().length * board.getCells().length -1) {
                winner = player;
                System.out.println("WINNER is :" + winner.getName());
                return;
            }
            player.setPosition(checkJump(currentPosition));
            System.out.println("Player " + player.getName() + " final score after rolling dice is " + player.getPosition());
        }
    }

    private int checkJump(int currentPosition) {
        Cell cell = board.getCellPosition(currentPosition);
        if(cell.getJump() == null) {
            return currentPosition;
        }
        final String jumpedBy = cell.getJump().getStart() < cell.getJump().getEnd() ? "Ladder" : "Snake";
        System.out.println("Jumped by " + jumpedBy + " from " + currentPosition + " to " + cell.getJump().getEnd());
        return cell.getJump().getEnd();
    }


    private Player findPlayerTurn() {
        Player player = players.removeFirst();
        players.addLast(player);
        return player;
    }

}

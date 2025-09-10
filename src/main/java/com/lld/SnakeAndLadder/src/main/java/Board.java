package src.main.java.com.lld.SnakeAndLadder.src.main.java;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private Cell [][] cells;

    public Board(int size, int ladder, int snakes) {
        initialiseCells(size);
        initialiseSnakeAndLadder(cells, snakes, ladder);
    }

    private void initialiseCells(int size) {
        cells = new Cell[size][size];
        for(int i =0; i < size; i++) {
            for(int j =0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void initialiseSnakeAndLadder(Cell [][] cells, int snake, int ladder) {
        int n = cells.length;
        int upperBound = n * n;
        while (snake > 0) {
            int head = ThreadLocalRandom.current().nextInt(1, upperBound -1);
            int tail = ThreadLocalRandom.current().nextInt(1, upperBound -1);
            if(tail >= head) continue;
            Jump jump = new Jump(head, tail);
            Cell cell = getCellPosition(head);
            cell.setJump(jump);
            System.out.println("Snake " + snake + " is from " + head + " to " + tail);
            snake--;
        }

        while (ladder > 0) {
            int start = ThreadLocalRandom.current().nextInt(1, upperBound - 1);
            int end = ThreadLocalRandom.current().nextInt(1, upperBound - 1);
            if(end <= start) continue;

            Cell cell = getCellPosition(start);
            cell.setJump(new Jump(start, end));
            System.out.println("Ladder " + ladder + " is from " + start + " to " + end);
            ladder--;
        }
    }

    public Cell getCellPosition(int playerPosition) {
        int rowNum = playerPosition / cells.length;
        int colNum = playerPosition % cells.length;
        return cells[rowNum][colNum];

    }

    public Cell[][] getCells() {
        return cells;
    }
}
